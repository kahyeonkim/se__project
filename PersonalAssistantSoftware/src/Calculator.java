import java.util.*;

public class Calculator {
	Scanner scan = new Scanner(System.in);
	static Calculator calc = new Calculator();

	int selectCalculatorMenu() {

		System.out.println("1.Arithmetic Operation");
		System.out.println("2.Convertor");
		System.out.println("3.Go Back to Main");
		System.out.print("> ");

		int calc_menu = scan.nextInt();
		return calc_menu;
	}

	void selectArithmeticOperationMenu() {

		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Devide");
		System.out.print("> ");


		int calc_arithmetic_menu = scan.nextInt();

		System.out.print("Input numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		switch (calc_arithmetic_menu) {
		case 1:
			System.out.println(add(num1, num2));
			break;

		case 2:
			System.out.println(subtract(num1, num2));
			break;
		case 3:
			System.out.println(multiply(num1, num2));
			break;
		case 4:
			System.out.println(devide(num1, num2));
			break;

		}
	}

	double add(double num1, double num2) {
		return num1 + num2;
	}

	double subtract(double num1, double num2) {
		return num1 - num2;
	}

	double multiply(double num1, double num2) {
		return num1 * num2;
	}

	double devide(double num1, double num2) {
		return num1 / num2;
	}

	void selectConvertorMenu() {
		System.out.println("1. Weight Convertor");
		System.out.println("2. Length Convertor");
		System.out.println("3. Temparature Convertor");
		System.out.print("> ");

		int calc_convertor_menu = scan.nextInt();

		switch (calc_convertor_menu) {
		case 1:
			selectDirectionOfWeightConvertor();
			break;
		case 2:
			selectDirectionOfLengthConvertor();
			break;
		case 3:
			selectDirectionOfTemperatureConvertor();
			break;

		}
	}

	void selectDirectionOfWeightConvertor() {
		System.out.println("1. Kg to Pound");
		System.out.println("2. Pound to Kg");
		System.out.print("> ");

		int calc_D_weight_menu = scan.nextInt();

		System.out.print("Input number : ");
		double weight = scan.nextDouble();

		if (calc_D_weight_menu == 1)
			System.out.println(calc.convertKgToPound(weight));

		else if (calc_D_weight_menu == 2)
			System.out.println(calc.convertPoundToKg(weight));

	}

	void selectDirectionOfLengthConvertor() {
		System.out.println("1. Inch to cm");
		System.out.println("2. cm to Inch");
		System.out.print("> ");

		int calc_D_length_menu = scan.nextInt();

		System.out.print("Input number : ");
		double length = scan.nextDouble();

		if (calc_D_length_menu == 1)
			System.out.println(calc.convertInchToCm(length));

		else if (calc_D_length_menu == 2)
			System.out.println(calc.convertInchToCm(length));
	}

	void selectDirectionOfTemperatureConvertor() {
		System.out.println("1. Fahrenheit To Celsius ");
		System.out.println("2. Celsius To Fahrenheit");
		System.out.print("> ");

		int calc_D_temp_menu = scan.nextInt();

		System.out.print("Input number : ");
		double temp = scan.nextDouble();

		if (calc_D_temp_menu == 1)
			System.out.println(calc.convertInchToCm(temp));

		else if (calc_D_temp_menu == 2)
			System.out.println(calc.convertInchToCm(temp));

	}

	double convertKgToPound(double weight) {
		return weight * 2.204623;

	}

	double convertPoundToKg(double weight) {
		return weight * 0.453592;
	}

	double convertInchToCm(double length) {
		return length * 2.54;
	}

	double convertCmToInch(double length) {
		return length * 0.393701;
	}

	double convertFahrenheitToCelsius(double temperature) {
		return (temperature - 32) / 1.8;
	}

	double convertCelsiusToFahrenheit(double temperature) {
		return (temperature * 1.8) + 32;
	}
}