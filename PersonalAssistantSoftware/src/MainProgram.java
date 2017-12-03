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

			switch (menu) {
<<<<<<< HEAD
			case 1: // Memo Manager
				
				
=======
			case 1: // 硫붾え湲곕뒫
>>>>>>> 2ce44035ebcb01d0d781a5c5e73aa05658e080c0
				MemoManager memoManager = new MemoManager();
				int memoMenu;
				do {
					memoMenu = memoManager.selectMemoMenu();
					switch (memoMenu) {
					case 1:
<<<<<<< HEAD
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
=======
						System.out.print("�깉濡쒖슫 硫붾え �궡�슜�쓣 �엯�젰�븯�꽭�슂: ");
						String newMemo = scan.nextLine(); // �븳 以꾨쭔 諛쏆쓣�닔�엳�쓬
						memoManager.create(newMemo);
						break;
					case 2:
						System.out.print("�닔�젙�븷 硫붾え�쓽 踰덊샇瑜� �엯�젰�븯�꽭�슂: ");
						int memoNumberToUpdate = scan.nextInt();
						scan.nextLine();
						System.out.print("�닔�젙�븷 硫붾え�쓽 �궡�슜�쓣 �엯�젰�븯�꽭�슂: ");
						String updateMemo = scan.nextLine(); // �븳 以꾨쭔 諛쏆쓣�닔�엳�쓬
						memoManager.update(memoNumberToUpdate, updateMemo);
						break;
					case 3:
						System.out.print("�궘�젣�븷 硫붾え�쓽 踰덊샇瑜� �엯�젰�븯�꽭�슂: ");
>>>>>>> 2ce44035ebcb01d0d781a5c5e73aa05658e080c0
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

			case 3: // 媛�怨꾨�
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
						System.out.print("�궇吏�:");
						date = scan.next();
						System.out.print("�궡�슜:");
						content = scan.next();
						System.out.print("媛�寃�:");
						price = scan.nextInt();
						PurchaseInfo purchaseInfo = new PurchaseInfo(date, content, price);
						accountBook.create(purchaseInfo);
						break;
					case 2:
						System.out.println("�닔�젙�븷 援щℓ �궡�뿭�쓣 �엯�젰�븯�꽭�슂.");
						System.out.print("援щℓ �궡�뿭 踰덊샇: ");
						purchaseNumberToUpdate = scan.nextInt();
						System.out.print("�궇吏�:");
						date = scan.next();
						System.out.print("�궡�슜:");
						content = scan.next();
						System.out.print("媛�寃�:");
						price = scan.nextInt();
						purchaseInfo = new PurchaseInfo(date, content, price);
						accountBook.update(purchaseNumberToUpdate, purchaseInfo);
						break;
					case 3:
						System.out.println("�궘�젣�븷 援щℓ �궡�뿭�쓽 踰덊샇瑜� �엯�젰�븯�꽭�슂.");
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
