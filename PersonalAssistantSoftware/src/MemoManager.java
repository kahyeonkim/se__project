import java.util.*;

public class MemoManager {
	ArrayList<String> memoList = new ArrayList();
	int memoCount = 0;
	
	public MemoManager() {
		memoList.add("-empty space-");
	}
	public int selectMemoMenu() {
		Scanner scan = new Scanner(System.in);
		int memoMenu;
		
		System.out.println("1. Create Memo");
		System.out.println("2. Update Memo");
		System.out.println("3. Delete Memo");
		System.out.println("4. Print Memo List");
		System.out.println("5. Go Back to Main");
		System.out.print("> ");
		
		memoMenu = scan.nextInt(); 
		scan.nextLine();
		System.out.println();

		return memoMenu; 	
	}
	
	public void create(String memo) {
		memoList.add(memo);
		memoCount++;
		printMemo(memoCount, "create");
	}
	
	public void update(int memoNumber, String newMemo) {
		memoList.remove(memoNumber);
		memoList.add(memoNumber, newMemo);
		printMemo(memoNumber, "update");
	}
	
	public void delete(int memoNumber) {
		String memo = memoList.get(memoNumber);
		
		memoList.remove(memo);
		memoCount--;
		printMemo(memoCount, "delete");

	}
	
	private void printMemo(int memoNumber, String function) {
		String contents = "Memo Number " + memoNumber + ": " + "The memo has been " + function +"d."; 
		System.out.println(contents);
		System.out.println();
	}

	public void printMemoList() {
		for(int i = 1; i < memoList.size(); i++) {
			String memo = memoList.get(i);
			System.out.println("Memo Number " + i + ": " + memo);
		}
		System.out.println();
	}
}
