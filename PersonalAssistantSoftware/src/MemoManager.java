import java.util.*;

/////////////////
// 기본메뉴로 돌아갔다가 다시 메모기능오면 그전내용 저장되있어야하나?
// 그러려면 변수를 main에 저장해야됨
////////////////

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
		printMemo(memoCount, "생성");
	}
	
	public void update(int memoNumber, String newMemo) {
		memoList.remove(memoNumber);
		memoList.add(memoNumber, newMemo);
		printMemo(memoNumber, "수정");
	}
	
	public void delete(int memoNumber) {
		String memo = memoList.get(memoNumber);
		
		memoList.remove(memo);
		memoCount--;
		printMemo(memoCount, "삭제");

	}
	///// 없는번호 입력시 예외처리??
	
	private void printMemo(int memoNumber, String function) {
		String contents = memoNumber + "번째 메모가 " + function + "되었습니다."; 
		System.out.println(contents);
		System.out.println();
	}

	public void printMemoList() {
		for(int i = 1; i < memoList.size(); i++) {
			String memo = memoList.get(i);
			System.out.println(i + "번째 메모: " + memo);
		}
		System.out.println();
	}
	
	public void goBackToMain() {
	//	MainProgram.printInitialScreen();
	}
}
