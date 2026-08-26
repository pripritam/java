// parent reference child object 
import java. util.Scanner;
abstract class annimal{
    abstract void speak();
} 
//for run time polymorphism you need parents and child 
class dog extends annimal{
    void speak(){
        System.out.println("they bark");
    }
}
class cat extends annimal{
    void speak(){
        System.out.println("they meow");
    }
}
public class runtimepolymorphism {
    
    public static void main(String[] args) {
        // dog dog=new dog();
        // cat cat =new cat();
        annimal animal;// parent reference 
Scanner op=new Scanner(System.in);
System.out.print("dog/cat : ");
int choice=op.nextInt();
if(choice==1){
    animal=new dog();// parent reference child object 
    animal.speak();
}
else {
    animal=new cat();
    animal.speak();
}
    }
}
