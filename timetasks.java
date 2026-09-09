import java.util.Timer;
import java.util.TimerTask;

public class timetasks {
    public static void main(String[] args) {
       Timer timer=new Timer();
       TimerTask task=new TimerTask(){
        @Override
        public void run(){//time is a public absstract classes
            System.out.println("hello");
        }
       };
    //    timer.schedule(task, 1000); 
       timer.schedule(task, 0,1000); 
       
        

    }
    
}
