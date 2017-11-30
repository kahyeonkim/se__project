import java.util.ArrayList;
import java.util.Scanner;

public class AccountBook {

	private static int menu;
	static Scanner scan = new Scanner(System.in);
	static ArrayList<PurchaseInfo> purchaseInfos = new ArrayList<>();

	public int selectAccountBookMenu() {
		System.out.println("1.내역 생성 ");
		System.out.println("2. 수정");
		System.out.println("3. 삭제 ");
		System.out.println("4. 전체 출력 ");
		System.out.println("5. 메인메뉴로 돌아가기 ");
		System.out.print("실행하실 메뉴를 선택하세요:");
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
			System.out.println("번호:"+i);
			purchaseInfos.get(i).printList();
		}
	}
}