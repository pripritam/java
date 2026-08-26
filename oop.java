 class car{
    String model="ram";
    void start(){
        System.out.println("you start the engine");
    }
}
public class oop {
    public static void main(String[] args) {
        car op=new car();
        System.out.println(op.model);
        op.start();
    }
    
}
