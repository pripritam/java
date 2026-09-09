import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class date_time {
    public static void main(String[] args) {
      LocalDate date=LocalDate.now();
      LocalTime time=LocalTime.now();
      LocalDateTime dt=LocalDateTime.now(); 
      Instant instant =Instant.now();//give uts date and time
      System.out.println(date+" "+time+ " "+dt+ " "+instant);
       
      

      //custom format

        LocalDateTime dtt=LocalDateTime.now(); 
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

        String newdtt=dtt.format(formatter);
        System.out.println(newdtt);


        LocalDateTime date1=LocalDateTime.of(2024,12,25,12,0,0);
        LocalDateTime date2=LocalDateTime.of(2025,1,1,0,0,0);

        if(date1.isBefore(date2)){
            System.out.println("before");
        }
        else if(date1.isAfter(date2)){
            System.out.println("after");

        }
        else if(date1.isEqual(date2)){
            System.out.println("eqal");
        }

    }
    
}
