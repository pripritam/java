class mob{
    String brand;
    int price;
static int marks=20;  // change in    public static void main reflect data change for variable static

    void main(){
        System.err.println(brand+":"+ price);
    }
}


public class staticvariable{
    

public static void main(String ar[]) {

   mob s=new mob();
   s.brand="pppp";
   s.price=100;
   
   s.main();
   mob s1=new mob();
   s1.brand="eeee";
   s1.price=10;
   
   

   s1.main();


      mob s3=new mob();
      s3.marks=30;
      System.out.println(s3.marks);

}
}