import java.util.Scanner;
class runable implements Runnable{//for use thread Runnable is necessary
    //and it is interface and abstract
     public void run(){
                for(int i=1;i<=5;i++){
           try{ Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("interrupt");
        }

        if(i==5){
            System.out.println("times up");
        }
    }

    }
}
public class threading {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.println("you have 5 seacond to enter your name");
        runable ru=new runable();
        Thread thread=new Thread(ru);
        thread.start();



        System.out.print("enter yiur name :");
        String name=op.nextLine();
        System.out.println("hello"+name);

    }
}
