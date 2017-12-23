import java.util.*;
import java.io.*;

public class MemoManager {
	ArrayList<String> memoList = new ArrayList<String>();
	String fileName = "my_memo.txt";

	public MemoManager() throws Exception {		
		try {
			ObjectInputStream memoData = new ObjectInputStream(new FileInputStream(fileName));
			memoList = (ArrayList<String>) memoData.readObject();
			System.out.println("Memo has been recalled from the file. \n");
			
			if(memoData != null) {
				try {
					memoData.close();
				}
				catch(IOException e) {}
			}
			
			if (memoList.isEmpty()) {
				memoList.add("-empty space-");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
	
	public ArrayList<String> create(String memo) {
		int memoNumberCount; 
		memoList.add(memo);
		memoNumberCount = memoList.size() - 1;
		printMemo(memoNumberCount, "create");
		System.out.println(memoList);

		try {
			ObjectOutputStream memoData = new ObjectOutputStream(new FileOutputStream(fileName));
			memoData.writeObject(memoList);
			memoData.close();
		}
		catch (Exception e) {}
		
		return memoList;
	}
	
	public ArrayList<String> update(int memoNumber, String newMemo) {
		memoList.remove(memoNumber);
		memoList.add(memoNumber, newMemo);
		printMemo(memoNumber, "update");
		
		try {
			ObjectOutputStream memoData = new ObjectOutputStream(new FileOutputStream(fileName));
			memoData.writeObject(memoList);
			memoData.close();
		}
		catch (Exception e) {}
	
		return memoList;
	}
	
	public void delete(int memoNumber) {		
		String memo = memoList.get(memoNumber);
		
		memoList.remove(memo);
		printMemo(memoNumber, "delete");
		
		try {
			ObjectOutputStream memoData = new ObjectOutputStream(new FileOutputStream(fileName));
			memoData.writeObject(memoList);
			memoData.close();
		}
		
		catch (Exception e) {}
	}
	
	private void printMemo(int memoNumber, String function) {
		String contents = "Memo Number " + memoNumber + ": " + "The memo has been " + function +"d."; 
		System.out.println(contents);
		System.out.println();
	}

	public void printMemoList() {
		if (memoList.size() == 1) {
			System.out.println("Memo file is empty. \n");
			return;
		}
		for(int i = 1; i < memoList.size(); i++) {
			String memo = memoList.get(i);
			System.out.println("Memo Number " + i + ": " + memo);
		}
		System.out.println();
	}
}
