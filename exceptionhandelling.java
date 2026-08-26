// Exception Handling in Java is a mechanism used to handle runtime errors so that 
// the program does not terminate suddenly.
// | Keyword   | Meaning                                       |
// | --------- | --------------------------------------------- |
// | `try`     | Code that may cause an exception              |
// | `catch`   | Handles the exception                         |
// | `finally` | Executes whether exception occurs or not      |
// | `throw`   | Manually throws an exception                  |
// | `throws`  | Declares that a method may throw an exception |



import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptionhandelling {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
    //   try{
    //     System.out.println(1/0);
    //   }
    //   catch(ArithmeticException e){
    //     System.out.println("you can not divide with zero");
    //   }
      try{
        System.out.println("enter a number");
        int num=op.nextInt();
        System.out.println(num);
      }
    //   catch(InputMismatchException o){
    //     System.out.println("wrong number");
    //   }
      catch(Exception o){
        //saftey net
        System.out.println("my programme is not running");
      }
      finally{
        op.close();
        System.out.println("this alwas exicute");

      }

    }
    
}
