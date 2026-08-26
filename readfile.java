// FileReader = connects to the file and reads characters
// BufferedReader = takes those characters and makes reading easier/faster, especially line by line.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readfile {
    public static void main(String[] args) {
  
      try{
      
        String filepath="C:\\Users\\ASUS\\OneDrive\\Desktop\\p.txt";
        BufferedReader reader=new BufferedReader(new FileReader(filepath));
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
        System.out.println("file exist");
      }

catch(FileNotFoundException H){
    System.out.println("could not file reaedr");
}
catch(IOException r){
    System.out.println("something wenr wrong");
}



    }
    
}
