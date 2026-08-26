import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        // double re;
        // re=Math.pow(2,3);
        // System.out.println(re);
//Math.PI=3.14
  Scanner op=new Scanner(System.in);
  double a;
  double b;
  double c;
  System.out.println("enter the value of a :");
  a= op.nextDouble();
  System.out.println("enter the value of b :");
  b= op.nextDouble();

  c=Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//   System.out.println(c);
  System.out.printf("value is %.1f",c);
  op.close();

    }
}
