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

	public void create(PurchaseInfo purchaseInfo) {
		int purchaseNum=0;
		purchaseInfos.add(purchaseInfo);
		printAccountList(purchaseNum, purchaseInfo);
		purchaseNum++;
	}

	private void printAccountList(int purchaseNum,PurchaseInfo purchaseinfo) {
		purchaseInfos.get(purchaseNum).printList();
	}

	public void update(int purchaseNum,PurchaseInfo purchaseinfo) {
		purchaseInfos.set(purchaseNum,purchaseinfo);
	}
	
	public void delete(int purchaseNum) {
		purchaseInfos.remove(purchaseNum);
	}

	public void printAccountLists() {
		for(int i=0;i<purchaseInfos.size();i++){
			System.out.println("No.:"+i);
			purchaseInfos.get(i).printList();
		}
	}
}