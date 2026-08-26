// | Primitive | Wrapper class |
// | --------- | ------------- |
// | `int`     | `Integer`     |
// | `double`  | `Double`      |
// | `float`   | `Float`       |
// | `char`    | `Character`   |
// | `boolean` | `Boolean`     |
// | `byte`    | `Byte`        |
// | `short`   | `Short`       |
// | `long`    | `Long`        |
//A wrapper class in Java is a class that allows you to treat a primitive data type as an object.
// Integer b = 10;orInteger b = new Integer(10);wrapper classes



public class wrapperclasses {
    public static void main(String[] args) {
        // Integer a =new Integer(1223);
        String a=Integer.toString(123);
        String b=Double.toString(9.76);

        String c=Character.toString('#');
        String d=Boolean.toString(false);
        String x=a+b+c+d;
        System.out.println(x);

        int g=Integer.parseInt("123");
        double k=Double.parseDouble("3.678");
        char j="pizza".charAt(0);
    boolean m=Boolean.parseBoolean("FALSE");
    System.out.println(g);
    char n='b';
    System.out.println(Character.isLetter(n));
    System.out.println(Character.isUpperCase(n));






    }
    
}
