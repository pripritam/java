class myrun implements Runnable{
    private String text;
    myrun(String text){
        this.text=text;
    }
    public void run(){
        
                   for(int i=1;i<=5;i++){
           try{ Thread.sleep(1000);
            System.out.println(text);
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


public class mutithreading {
    public static void main(String[] args) {
        
myrun op=new myrun("ping");
myrun opp=new myrun("pong");
Thread thread1=new Thread(op);
Thread thread2=new Thread(opp);
System.out.println("game start");
thread1.start();
thread2.start();
try{
thread1.join();
thread2.join();
}
catch(InterruptedException e){
    System.out.println("invalid");
}
System.out.println("game over");//here if we do not use join then ouput is like this
// game start
// game over
// ping
// pong
// ping
// pong
// pong
// ping
// pong
// ping
// pong
// times up
// ping
// times up

    }
    
}
