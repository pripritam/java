import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

class alarmclock implements Runnable{
    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner op;
    alarmclock(LocalTime alarmTime,String filepath,Scanner op){
    this.alarmTime=alarmTime;
    this.filepath=filepath;
    this.op=op;

 
    }
    @Override   
    public void run(){
       // LocalTime now=LocalTime.now();//give present time
                  // System.out.println(now);
                  while(LocalTime.now().isBefore(alarmTime)){
                            try{
                                Thread.sleep(1000);
                                // System.out.println(LocalTime.now());
                                LocalTime now=LocalTime.now();
                                // int hours=now.getHour();
                                // int minutes=now.getMinute();
                                // int seacond=now.getSecond();
                                // System.out.printf("\r%02d:%02d:%02d",hours,minutes,seacond);
                                System.out.printf("\r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond());
                                
                            // 2 → use at least 2 digits
                            // 0 → if there is only 1 digit, add 0 before it
                            //So for a timer, \r is used to keep updating the time on the same line

                            }
                            catch( InterruptedException e){
                                System.out.println("thread was interrupted");
                            }
                  }

                  System.out.println("ALARM NOISES");
                //  Toolkit.getDefaultToolkit().beep();//give sound when it end
                  playsound(filepath);
    }
        private void playsound(String filepath){
            File audiofile=new File(filepath);
            try(AudioInputStream audiostream=AudioSystem.getAudioInputStream(audiofile)){
                Clip clip=AudioSystem.getClip();
                clip.open(audiostream);
                clip.start();
                System.out.println("press* enetr to stop the alarm");
                op.nextLine();//stop current process when press enter waiting for next instruction
                clip.stop();

            }
            catch(UnsupportedAudioFileException e){
            System.out.println("audio file not supported");

            }
            catch(LineUnavailableException e){
                System.out.println("audio is unaviallable");
            }
            catch(IOException e){
                System.out.println("error audio recording");
            }
        }

}


public class alarm_clock {
    public static void main(String[] args) {


    Scanner op=new Scanner(System.in);
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalTime alarmtime=null;//LocalTime alarmTime = a variable named alarmTime that stores the time at which the alarm should ring
    String filepath="music_player.wav";
    while(alarmtime==null){  
            try{
            System.out.print("enter an alarm time(HH:mm:ss): ");
            String inputtime=op.nextLine();
            alarmtime=LocalTime.parse(inputtime,formatter);
                            // System.out.println(alarmtime);
                }
                catch(DateTimeParseException e){
                    System.out.println("invalid format");

                }

    }
    alarmclock alarmclock=new alarmclock(alarmtime,filepath,op);
    Thread alarmThread=new Thread(alarmclock);
    alarmThread.start();
        
    }
    
}
