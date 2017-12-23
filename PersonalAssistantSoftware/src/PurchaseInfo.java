import java.io.Serializable;

public class PurchaseInfo implements Serializable {

   public PurchaseInfo(String date, String content, int price) {
      // TODO Auto-generated constructor stub
      this.date = date;
      this.price = price;
      this.content = content;
   }

   private String date;
   private int price;
   private String content;

   
   public void printList() {
      System.out.println("\ndate:" + date);
      System.out.println("content:" + content);
      System.out.println("price:" + price);
      System.out.println("");
   }
   public String getDate(){
      return date;
   }
   public String getContent(){
      return content;
   }
   public int getPrice(){
      return price;
   }
   
}