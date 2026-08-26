import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        
int pri=44;
String op=(pri>=45) ? "pass":"fail";

System.out.println(op);

int num=4;
String opp=(num%2==0)?"even":"odd";
System.out.println(opp);

Scanner p=new Scanner(System.in);
System.out.print("enter a number: ");

double value=p.nextFloat();

System.out.print("enter a number for convert c to f: ");

String unit=p.next();
double conv=(unit.equals("c"))?(value-32)*5/9 :(value*5/9)+32;
System.out.println(conv  + unit);

    }
    
}
 