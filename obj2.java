                                                                         

  class calculator{     
    
                         //method over loading(only modify parameter but not function)
// int add(int n1,int n2,int n3){
//     return n1+n2+n3;
// }
// int add(int n1,int n2){
//     return n1+n2;
// }
// double add( double n1,double n2){
//     return n1+n2;
// }

    
 void oc(){
System.out.println("pri");
 }
    String hp(int cost) {
        if(cost>=10)
             return "opppppppp";
            else
                return "no";
    }
    }
                      




 public class obj2 {
    public static void main(String arr[]) {
         calculator q=new calculator();
         q.oc();
                calculator c=new calculator();
                
                                     //String p= c.hp();
               System.out.println(c.hp(5));
  

    }
    
}