import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.*;


public class MemoManagerTest {
	@Test
	public void testCreateMemo() throws Exception {
		MemoManager memoManager = new MemoManager();	
		String memoTest = "Test for create";
		String lastMemo;
		Vector<String> memoTestList;
	
		memoTestList = memoManager.create(memoTest);
		lastMemo = memoTestList.lastElement();
		assertEquals(memoTest, lastMemo);

		int lastMemoIndex = memoManager.memoList.lastIndexOf(lastMemo);
		memoManager.delete(lastMemoIndex);
	}

	@Test
	public void testUpdateMemo() throws Exception {
		MemoManager memoManager = new MemoManager();	
		String memoBeforeUpdate = "Test before update";
		String memoAfterUpdate = "Test after update";
		String lastMemo;
		int lastMemoIndex;
		Vector<String> memoTestList;
	
		memoTestList = memoManager.create(memoBeforeUpdate);
		lastMemo = memoTestList.lastElement();
		assertEquals(memoBeforeUpdate, lastMemo);
		lastMemoIndex = memoManager.memoList.lastIndexOf(lastMemo);
		memoTestList = memoManager.update(lastMemoIndex, memoAfterUpdate);
		lastMemo = memoTestList.lastElement();
		lastMemoIndex = memoManager.memoList.lastIndexOf(lastMemo);
		memoManager.delete(lastMemoIndex);
	}

	@Test
	public void testDelete() throws Exception {
		MemoManager memoManager = new MemoManager();	
		int sizeBeforeDelete;
		int memoNumberToBeDeleted;
		
		sizeBeforeDelete = memoManager.memoList.size();
		memoManager.create("Test for delete");
		memoNumberToBeDeleted = memoManager.memoList.size() -1;
		memoManager.delete(memoNumberToBeDeleted);
		
		assertTrue(memoManager.memoList.size() == sizeBeforeDelete);
	}
}