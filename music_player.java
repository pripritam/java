import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;


public class music_player {
    public static void main(String[] args) {
        
String filepath="music_player.wav";

File file =new File(filepath);



try(AudioInputStream audiodtream= AudioSystem.getAudioInputStream(file)){
//for getAudioInputStream one catch exceotion 
Scanner op=new Scanner(System.in);
Clip clip=AudioSystem.getClip();//for get clip one exceotion insert in catch

clip.open(audiodtream);

String response="";
while (!response.equals("q")) {
    System.out.println("p=play😒");
    System.out.println("s=stop❤️");
    System.out.println("r=reset😁");
    System.out.println("q=quit🍌");

    System.out.print("enter your choice :");
    response=op.next();
    switch (response) {
        case"p"->clip.start();
        case"s"->clip.stop();
        case"q"->clip.close();
        case"r"->clip.setMicrosecondPosition(0);
     
        default->System.out.println("invalid choice");
            
    }
}



}
catch(FileNotFoundException e){
    System.out.println("could not locate this file");
}
catch(LineUnavailableException e){
    System.out.println("unable to acess audio resouce");
}
catch(UnsupportedAudioFileException e){
    System.out.println("audio file not supported");
}

catch(IOException e){
    System.out.println("something went wrong");
}
finally{
    System.out.println("bye🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️");
}

    }
    
}
