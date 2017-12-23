
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountBook {

	private static int menu;
	static Scanner scan = new Scanner(System.in);
	static ArrayList<PurchaseInfo> purchaseInfos = new ArrayList<>();

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
		int purchaseNum = 0;
		purchaseInfos.add(purchaseInfo);
		
		purchaseInfos.get(purchaseNum).writeAccount();
		
		printAccountList(purchaseNum, purchaseInfo);
		purchaseNum++;
	}

	/*
	 * public void writeAccount(int purchaseNum) { try { File accountText = new
	 * File("test.txt"); BufferedWriter bw = new BufferedWriter(new
	 * FileWriter(accountText));
	 * 
	 * if (accountText.isFile() && accountText.canWrite()) { // 쓰기
	 * bw.write(purchaseInfos.get(purchaseNum)); // 개행 문자쓰기 bw.newLine();
	 * bw.write("문자열2"); bw.close(); }
	 * 
	 * } catch (IOException e) { System.out.println(e); } }
	 */

	private void printAccountList(int purchaseNum, PurchaseInfo purchaseinfo) throws IOException {
		// purchaseInfos.get(purchaseNum).printList();
		purchaseInfos.get(purchaseNum).readAccount();
	}

	public void update(int purchaseNum, PurchaseInfo purchaseinfo) {
		purchaseInfos.set(purchaseNum, purchaseinfo);
	}

	public void delete(int purchaseNum) {
		purchaseInfos.remove(purchaseNum);
	}

	public void printAccountLists() throws IOException {
		for (int i = 0; i < purchaseInfos.size(); i++) {
			System.out.println("No.:" + i);
			purchaseInfos.get(i).readAccount();
		}
	}
}