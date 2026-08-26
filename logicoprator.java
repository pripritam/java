import java. util.Scanner;
import java. util.Random;
public class logicoprator {
    public static void main(String[] args) {
        

// double temp=20;
// boolean sunny=  true;
// if(temp<30 && temp>0 && sunny){
//     System.err.printf("maderchod");
    
// }

    // Scanner op=new Scanner(System.in);
    // System.out.println("enter a number :");
    // String user;
    // user=op.nextLine();
    // if(user.length()>3){
    //     System.out.println("gandu");
    // }
    // if(user.contains(" ") || user.contains(" _ ")){
    //     System.out.println("it is not working😂");
    // }

            //// number guessing game....


Random random=new Random();
Scanner op=new Scanner(System .in);

int randomnumber=random.nextInt(1,10);
System.out.println(randomnumber);
int guess;
int attempt=0;
System.out.println("it is a number guessing game ");
System.out.println("guess a number between 1 to 10 :");

      
do{
    System.out.println("enter ypur guess : ");
    guess=op.nextInt();
    attempt++;


}while (guess != randomnumber) ;
    
System.out.println("you have won");
   System.out.println("you done some crazy shit:  " +   attempt);     

    }    
}
