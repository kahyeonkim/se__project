import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
	Calculator calculator = new Calculator();
	
	@Test
	public void testLengthConvertorInchToCm() {
		assertTrue(calculator.convertInchToCm(1) == 2.54);
	}
	
	@Test
	public void testLengthConvertorCmToInch() {
		assertTrue(calculator.convertCmToInch(1) == 0.393701);		
	}
	
	@Test
	public void testCalculatorAdd() {
		assertTrue(calculator.add(1, 2) == 3);
	}
	
	@Test
	public void testCalculatormultifly() {
		assertTrue(calculator.multiply(1, 2) == 2);		
	}
}
