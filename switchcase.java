import java.util.Scanner;
public class switchcase{
public static void main(String[] args) {
    Scanner op=new Scanner(System.in);
    //  System.out.println("enter a number ");
    // String day="monday";

    // switch(day){
    //     // case "monday"->System.out.println("pppp");
    //     // case "tuesday"->System.out.println("ggg");
    //     // default ->System.out.println("gandu");
    //     case "monday","tuesday"->System.out.println("pppp");
        
    //     default ->System.out.println("gandu");}

            double num1;
            double num2;
            char oprator;
            double re;
             System.out.println("enter a firstr number: ");
             num1=op.nextInt();
                System.out.println("enter a oprator");
                oprator=op.next().charAt(0);
                System.out.println("enter a second number: ");
             num2=op.nextInt();
     switch (oprator) {
            case '+'->System.out.println(num1+num2);
          case '*' ->System.out.println(num1*num2); 
          case '^'-> System.out.println(Math.pow(num1,num2));
          default->System.out.println("mora ja");


     }   
    
    


}
}    