
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountBook {

	private static int menu;
	static Scanner scan = new Scanner(System.in);
	protected ArrayList<PurchaseInfo> purchaseInfos = new ArrayList<>();
	private String accountText = "accountText6.txt";

	public AccountBook() throws Exception {
		try {
			ObjectInputStream accountData = new ObjectInputStream(new FileInputStream(accountText));
			purchaseInfos = (ArrayList<PurchaseInfo>) accountData.readObject();
			System.out.println("Account has been recalled from the file. \n");

		} catch (FileNotFoundException e) {
			ObjectOutputStream accountData = new ObjectOutputStream(new FileOutputStream(accountText));
			// e.printStackTrace();
		}
	}

	public int selectAccountBookMenu() {
		System.out.println("1. Create Purchase List ");
		System.out.println("2. Update Purchase List");
		System.out.println("3. Delete Purchase List ");
		System.out.println("4. Print All Purchase List ");
		System.out.println("5. Go Back To Main ");
		System.out.print(">");
		menu = scan.nextInt();
		return menu;
	}

	public void create(PurchaseInfo purchaseInfo) throws IOException {
		int purchaseNum = purchaseInfos.size();
		purchaseInfos.add(purchaseInfo);
		printAccountList(purchaseNum, purchaseInfo);
		purchaseNum++;
		writeToAccount();
	}

	public void writeToAccount() {
		try {
			ObjectOutputStream accountData = new ObjectOutputStream(new FileOutputStream(accountText));
			accountData.writeObject(purchaseInfos);
			accountData.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private void printAccountList(int purchaseNum, PurchaseInfo purchaseinfo) throws IOException {
		purchaseInfos.get(purchaseNum).printList();
	}

	public void update(int purchaseNum, PurchaseInfo purchaseinfo) {
		try {
			purchaseInfos.set(purchaseNum - 1, purchaseinfo);
			writeToAccount();
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	public void delete(int purchaseNum) {
		try {
			purchaseInfos.remove(purchaseNum - 1);
			writeToAccount();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("not exist");
			System.out.println(e);
		}
	}

	public void printAccountLists() throws IOException {
		for (int i = 0; i < purchaseInfos.size(); i++) {
			System.out.println("number" + (i + 1) + " account :");
			purchaseInfos.get(i).printList();
		}
	}

}