import java.util.*;

public class MainProgram {
	Scanner scan = new Scanner(System.in);
	
	public int selectMenu() {		
		System.out.println("1. Memo Manager");
		System.out.println("2. Calculator");
		System.out.println("3. Account Book");
		System.out.println("4. Quit");
		System.out.print("> ");
		
		int menu = scan.nextInt();
		scan.nextLine();
		System.out.println();

		return menu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainProgram main = new MainProgram();
		Scanner scan = new Scanner(System.in);
		int menu;
		
		do {
			menu = main.selectMenu();
			
			switch(menu) {
			case 1: // 메모기능 
				MemoManager memoManager = new MemoManager();
				int memoMenu;
				do{
					memoMenu = memoManager.selectMemoMenu();					
					switch(memoMenu) {
					case 1:
						System.out.print("새로운 메모 내용을 입력하세요: ");
						String newMemo = scan.nextLine(); //한 줄만 받을수있음
						memoManager.create(newMemo);
						break;
					case 2:
						System.out.print("수정할 메모의 번호를 입력하세요: ");
						int memoNumberToUpdate = scan.nextInt();
						scan.nextLine();
						System.out.print("수정할 메모의 내용을 입력하세요: ");
						String updateMemo = scan.nextLine(); //한 줄만 받을수있음
						memoManager.update(memoNumberToUpdate, updateMemo);				
						break;
					case 3:
						System.out.print("삭제할 메모의 번호를 입력하세요: ");
						int memoNumberToDelete = scan.nextInt();
						scan.nextLine();
						memoManager.delete(memoNumberToDelete);
						break;
					case 4:
						System.out.println();
						memoManager.printMemoList();
						break;
					}					
				} while(memoMenu != 5);				
				break;
				
			case 2: //계산기 기능
				Calculator calculator = new Calculator();
				int calculatorMenu;
				do{
					calculatorMenu = calculator.selectCalculatorMenu();
					switch(calculatorMenu) {
					case 1: //사칙 연산
						double num1, num2;
						int arithmeticOperationMenu = calculator.selectArithmeticOperationMenu();
						switch(arithmeticOperationMenu) {
						case 1:
							System.out.print("덧셈을 수행할 두 실수를 입력하세요: ");
							num1 = scan.nextDouble();
							num2 = scan.nextDouble();
							calculator.add(num1, num2);
							break;
						case 2:
							System.out.print("뺄셈을 수행할 두 실수를 입력하세요: ");
							num1 = scan.nextDouble();
							num2 = scan.nextDouble();
							calculator.subtract(num1, num2);
							break;
						case 3:
							System.out.print("곱셈을 수행할 두 실수를 입력하세요: ");
							num1 = scan.nextDouble();
							num2 = scan.nextDouble();
							calculator.multiply(num1, num2);
							break;
						case 4:
							System.out.print("나눗셈을 수행할 두 실수를 입력하세요: ");
							num1 = scan.nextDouble();
							num2 = scan.nextDouble();
							calculator.divide(num1, num2);
							break;
						}
						break;
					case 2: //단위 변환
						double weight, length, temperature;
						int direction;
						int convertorMenu = calculator.selectConvertMenu();
						switch(convertorMenu) {
						case 1:
							direction = calculator.selectDirectionOfWeightConvertor();
							if (direction == 1) {
								System.out.print("무게(kg)를 입력하세요: ");
								weight = scan.nextDouble();
								calculator.convertKgToPound(weight);
							}
							if (direction == 2) {
								System.out.print("무게(pound)를 입력하세요: ");
								weight = scan.nextDouble();
								calculator.convertPoundToKg(weight);
							}
							break;
						case 2:
							direction = calculator.selectDirectionOfLengthConvertor();
							if (direction == 1) {
								System.out.print("길이(Inch)를 입력하세요: ");
								length = scan.nextDouble();
								////////////////////////////////////
							//	((Object) calculator).convertInchToCm(length);
							    ///////////////////////////////////
							}
							if (direction == 2) {
								System.out.print("길이(cm)를 입력하세요: ");
								length = scan.nextDouble();
								calculator.convertCmToInch(length);
							}
							break;
						case 3:
							direction = calculator.selectDirectionOfTemperatureConvertor();
							if (direction == 1) {
								System.out.print("온도(F)를 입력하세요: ");
								temperature = scan.nextDouble();
								calculator.convertFahrenheitToCelsius(temperature);
							}
							if (direction == 2) {
								System.out.print("온도(C)를 입력하세요: ");
								temperature = scan.nextDouble();
								calculator.convertCelsiusToFahrenheit(temperature);
							}
							break;
						}
						break;
					}					
				} while(calculatorMenu != 3);
				break;
				
			case 3: //가계부
				AccountBook accountBook = new AccountBook();
				String date = new String();
				int price;
				String content = new String();
				int accountBookMenu;
				int purchaseNumberToUpdate, purchaseNumberToDelete;
				
				do{
					accountBookMenu = accountBook.selectAccountBookMenu();
					switch(accountBookMenu) {
					case 1:
						System.out.print("날짜:");
						date = scan.next();
						System.out.print("내용:");
						content = scan.next();
						System.out.print("가격:");
						price = scan.nextInt();
						PurchaseInfo purchaseInfo = new PurchaseInfo(date, content, price);
						accountBook.create(purchaseInfo);
						break;
					case 2:
						System.out.println("수정할 구매 내역을 입력하세요.");
						System.out.print("구매 내역 번호: ");
						purchaseNumberToUpdate = scan.nextInt();
						System.out.print("날짜:");
						date = scan.next();
						System.out.print("내용:");
						content = scan.next();
						System.out.print("가격:");
						price = scan.nextInt();
						purchaseInfo = new PurchaseInfo(date, content, price);
						accountBook.update(purchaseNumberToUpdate,purchaseInfo);
						break;
					case 3:
						System.out.println("삭제할 구매 내역의 번호를 입력하세요.");
						purchaseNumberToDelete = scan.nextInt();
						accountBook.delete(purchaseNumberToDelete);	
						break;
					case 4:
						accountBook.printAccountLists();
						break;
					}					
				} while(accountBookMenu != 5);
				break;
			}			
		} while (menu != 4);				
	}
}
