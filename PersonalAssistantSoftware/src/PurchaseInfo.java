import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PurchaseInfo {

	public PurchaseInfo(String date, String content, int price) {
		// TODO Auto-generated constructor stub
		this.date=date;
		this.price=price;
		this.content=content;
	}
	
	private String date;
	private int price;
	private String content;
	
	public void printList(){
		
		System.out.println("date:"+ date);
		System.out.println("content:"+ content);
		System.out.println("price:"+ price);
	
	}
	
	public void writeAccount(){ //파일에 쓰기
				try {
			File accountText = new File("test.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(accountText));

			if (accountText.isFile() && accountText.canWrite()) {
				// 쓰기
				bw.write(date);
				// 개행 문자쓰기
				bw.newLine();
				bw.write(content);
				bw.newLine();
				bw.write(price);
				bw.newLine();
				bw.close();
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public void readAccount() throws IOException {
		try {//파일에 있는 거 읽기. 
			File accountText = new File("test.txt");
			FileReader fr = new FileReader(accountText);
			BufferedReader br = new BufferedReader(fr);
			String line = "";

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			} // readLine 은 끝에 개행문자를 읽지 않음.
				// bufferedReader을 이용하여 한 줄 씩 읽기.

			/*
			 * int ch = 0; while ((ch = fr.read()) != -1) {
			 * System.out.print(ch); } fr.close(); fileReader이용해서 한문자씩 읽음
			 */
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			System.out.println(e);
		}
		// for(int i=0;i<=purchaseInfos.size();i++){
		// outputs.write(purchaseInfos.get(purchaseNum));
		// }
	}

}