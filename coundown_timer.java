import java.util.Timer;
import java.util.TimerTask;

public class coundown_timer {
    public static void main(String[] args) {
        Timer timer=new Timer();
        TimerTask task=new TimerTask() {
           int count=5;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count<0){
                    System.out.println("happy");
                    timer.cancel();
                }
            }

        };
        timer.schedule(task, 0,1000);


    }
    
}
