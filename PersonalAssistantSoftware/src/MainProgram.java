import java.io.IOException;
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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MainProgram main = new MainProgram();
		Scanner scan = new Scanner(System.in);
		int menu;

		do {
			menu = main.selectMenu();

			switch (menu) {
			case 1:
				
				MemoManager memoManager = new MemoManager();
				int memoMenu;
				do {
					memoMenu = memoManager.selectMemoMenu();
					switch (memoMenu) {
					case 1:
						System.out.print("Write a new memo to create: ");
						String newMemo = scan.nextLine(); // (press <enter> to create)
						memoManager.create(newMemo);
						break;
					case 2:
						System.out.print("Enter the number of the memo to update: ");
						int memoNumberToUpdate = scan.nextInt();
						scan.nextLine();
						System.out.print("Write a new memo to update: ");
						String updateMemo = scan.nextLine();
						memoManager.update(memoNumberToUpdate, updateMemo);
						break;
					case 3:
						System.out.print("Enter the number of the memo to delete: ");
						int memoNumberToDelete = scan.nextInt();
						scan.nextLine();
						memoManager.delete(memoNumberToDelete);
						break;
					case 4:
						memoManager.printMemoList();
						break;
					}
				} while (memoMenu != 5);
				break;

			case 2:
				Calculator calculator = new Calculator();
				int calculatorMenu;
				do {
					calculatorMenu = calculator.selectCalculatorMenu();
					switch (calculatorMenu) {
					case 1:
						calculator.selectArithmeticOperationMenu();
						break;
					case 2:
						calculator.selectConvertorMenu();
						break;
					case 3:
						menu=0;
						break;
					}
				} while (calculatorMenu != 3);
				break;

			case 3: 
				AccountBook accountBook = new AccountBook();
				String date = new String();
				int price;
				String content = new String();
				int accountBookMenu;
				int purchaseNumberToUpdate, purchaseNumberToDelete;

				do {
					accountBookMenu = accountBook.selectAccountBookMenu();
					switch (accountBookMenu) {
					case 1:
						System.out.print("date:");
						date = scan.next();
						System.out.print("content:");
						content = scan.next();
						System.out.print("price:");
						price = scan.nextInt();
						PurchaseInfo purchaseInfo = new PurchaseInfo(date, content, price);
						accountBook.create(purchaseInfo);
						break;
					case 2:
						System.out.println("Write a new purchase list to update");
						System.out.print("Enter the number of the purchase list to update: ");
						purchaseNumberToUpdate = scan.nextInt();
						System.out.print("date:");
						date = scan.next();
						System.out.print("content:");
						content = scan.next();
						System.out.print("price:");
						price = scan.nextInt();
						purchaseInfo = new PurchaseInfo(date, content, price);
						accountBook.update(purchaseNumberToUpdate, purchaseInfo);
						break;
					case 3:
						System.out.println("Enter the number of the purchase list to delete:");
						purchaseNumberToDelete = scan.nextInt();
						accountBook.delete(purchaseNumberToDelete);
						break;
					case 4:
						accountBook.printAccountLists();
						break;
					}
				} while (accountBookMenu != 5);
				break;
			}
		} while (menu != 4);
	}
}
