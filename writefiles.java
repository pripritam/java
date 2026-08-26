import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class writefiles {
    public static void main(String[] args) {
        String location="C:\\Users\\ASUS\\OneDrive\\Desktop\\f.txt";
       
        try{
            FileWriter write=new FileWriter("test.txt");
            FileWriter writee=new FileWriter("C:\\Users\\ASUS\\test.txt");
            FileWriter writeee=new FileWriter(location);
            write.write("file has been written");
            writee.write("file has been  😂😂😂😂 written");
            writeee.write("file has been written in download");
            System.out.println("file written is complete");
            write.close();
            writee.close();
            writeee.close();
        }
        catch(FileNotFoundException H){
            System.out.println("could not found file location");
        }
        catch(IOException m){
            System.out.println("could not write");
        }
    }
    
}
