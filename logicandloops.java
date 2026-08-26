import java.util.Scanner;
import java.util.Random;
public class logicandloops {
    public static void main(String[] args) {
Random ran=new Random();
Scanner scan=new Scanner(System.in);
//  System.out.println("enter a number ");
//  String username;
//  username=op.nextLine();
//  if(username.length()<4 || username.length()>13){
//     System.out.printf("%s",username);
//  }
int guess;
int attempt=0;
int randomnumber;


 randomnumber=ran.nextInt(1,10);
System.out.println(randomnumber);

do{

System.out.print("enter a guess :");
guess= scan.nextInt();
attempt++;

}while(guess !=randomnumber);

System.out.println("nothing");
    }
    
}
