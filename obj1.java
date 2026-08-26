                                                                         //CLASS AND OBJECT    

  class calculator{                             //class
    int add (int n1,int n2){


        int r=n1 + n2;
      return r;  
    }
  }                           




 public class obj1 {
    public static void main(String arr[]) {
                
int num1=6,num2=5;
    calculator c=new calculator();              // make object and c will be object reference
    int result=c.add(num1,num2);
    System.out.println(result);        

    }
    
}