import java.util.Date;

public class AccountBook {

	public int selectAccountBookMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void create(PurchaseInfo purchaseInfo) {
		// TODO Auto-generated method stub
		
	}

	public void update(int purchaseNumberToUpdate, PurchaseInfo newPurchaseInfo) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int purchaseNumberToDelete) {
		// TODO Auto-generated method stub
		
	}

	public void printAccountList() {
		// TODO Auto-generated method stub
		
	}
}

class PurchaseInfo {
	Date purchaseDate;
	String item;
	int price;
	
	public PurchaseInfo(Date purchaseDate, String item, int price) {
		// TODO Auto-generated constructor stub
	}
	
	public PurchaseInfo(int number, Date purchaseDate, String item, int price) {
		
	}
	
}