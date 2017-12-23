import org.junit.*;
import static org.junit.Assert.*;

public class AccountBookTest {

	
	@Test
	public void testDeleteAccount() throws Exception{
		AccountBook accountBook = new AccountBook();
		PurchaseInfo purchaseInfo = new PurchaseInfo("2018/01/01", "Smartphone", 1500);
		int sizeBeforeDelete = accountBook.purchaseInfos.size();
		int memoNumberToBeDeleted = 1;
		accountBook.create(purchaseInfo);
		accountBook.delete(memoNumberToBeDeleted);
		assertTrue(accountBook.purchaseInfos.size() == sizeBeforeDelete);
	}
	
	@Test
	public void testCreateAccount() throws Exception {
		AccountBook accountBookTest = new AccountBook();
		PurchaseInfo purchaseInfoTest = new PurchaseInfo("20171221", "coffee", 5000);

		String expectedDate = purchaseInfoTest.getDate();
		String expectedContent = purchaseInfoTest.getContent();
		int expectedPrice = purchaseInfoTest.getPrice();

		accountBookTest.create(purchaseInfoTest);
		PurchaseInfo createdInfo = accountBookTest.purchaseInfos.get(accountBookTest.purchaseInfos.size() - 1);

		assertEquals(expectedDate, createdInfo.getDate());
		assertEquals(expectedContent, createdInfo.getContent());
		assertEquals(expectedPrice, createdInfo.getPrice());

	}

	@Test
	public void testUpdateAccount() throws Exception {
		AccountBook accountBookTest = new AccountBook();
		PurchaseInfo purchaseInfoTest = new PurchaseInfo("20171211", "smoothie", 6000);
		PurchaseInfo updateInfo = new PurchaseInfo("20200000", "pasta", 10000);

		String expectedDate = updateInfo.getDate();
		String expectedContent = updateInfo.getContent();
		int expectedPrice = updateInfo.getPrice();

		accountBookTest.create(purchaseInfoTest);
		int lastInfoNumber = accountBookTest.purchaseInfos.size();

		accountBookTest.update(lastInfoNumber, updateInfo);

		PurchaseInfo updatedInfo = accountBookTest.purchaseInfos.get(accountBookTest.purchaseInfos.size() - 1);

		assertEquals(expectedDate, updatedInfo.getDate());
		assertEquals(expectedContent, updatedInfo.getContent());
		assertEquals(expectedPrice, updatedInfo.getPrice());

	}

}