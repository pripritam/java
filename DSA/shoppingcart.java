
import java.util.Scanner;

 public class shoppingcart{


    public static void main(String arr[]) {
         Scanner s=new Scanner(System.in);
        String sc;
        double price;
        int quantity;
        double total;
        char c='$';
        System.out.println("what item would you like to buy : ");
       
        sc=s.nextLine();
        
         System.out.println("what is price for each : ");
        
         price=s.nextInt();

        System.out.println("how many would you like : ");
        quantity= s.nextInt();

        total=price * quantity;
        System.out.println("you have bought " + quantity+"\s");
        System.out.println("your total is" +c+ total);
        s.close();
        
    }
    
}