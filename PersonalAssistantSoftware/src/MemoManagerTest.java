
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MemoManagerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDelete() throws Exception {
		MemoManager memoManager = new MemoManager();	
		int sizeBeforeDelete;
		int memoNumberToBeDeleted = 1;
		sizeBeforeDelete = memoManager.memoList.size();
		memoManager.create("Memo - test for delete");
		memoManager.delete(memoNumberToBeDeleted);
		assertTrue(memoManager.memoList.size() == sizeBeforeDelete);
	}
}