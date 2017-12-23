import org.junit.*;
import static org.junit.Assert.*;

public class AccountBookTest {

	//@Test
	public void testCreateAccount(){
		
	}
	
//	@Test
	public void testUpdateAccount(){
		
	}
	
	@Test
	public void testDeleteAccount() throws Exception{
		AccountBook accountBook = new AccountBook();
		PurchaseInfo purchaseInfo = new PurchaseInfo("2018/01/01", "Smartphone", 1500);
		int sizeBeforeDelete = accountBook.purchaseInfos.size();
		int memoNumberToBeDeleted = 1;
		accountBook.create(purchaseInfo);
		accountBook.delete(memoNumberToBeDeleted);
		assertTrue(accountBook.purchaseInfos.size() == sizeBeforeDelete);
	}
}