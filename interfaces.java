interface prey{
    void flee();
   
}
interface predator{
    void hunt();
}

 class rabit implements prey{
    public void flee(){// why public?beacuse interface method is alwas public ans abstract
        System.out.println("rabbit is running");
    }

 }
class fish implements predator{
public void hunt(){
    System.out.println("is hunting");
}

 }
 class cow implements prey, predator{
    public void flee(){
        System.out.println("cow is bokachoda");
    }
    public void hunt(){
        System.out.println("cow is gandu");
    }

 }

 

public class interfaces {
    public static void main(String[] args) {
      //like abbstract method but here parent will be more than one
      // interface is like c a class
      
      rabit rabit=new rabit();
      fish fish=new fish();
      cow cow=new cow();
      rabit.flee();
      fish.hunt();
      cow.flee();
      cow.hunt();

    }
    
}
