import java.util.Scanner;

enum day{//enum act as a class
SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4);
private final int daynumber;//final fixed day number not change later
day(int daynumber){
    this.daynumber=daynumber;
}
int getDayNumber(){
    return daynumber;
}
}
public class enums {
    public static void main(String[] args) {
       
        // System.out.println(da);
        // System.out.println(da.getDayNumber());

        //for user  input
        Scanner op=new Scanner(System.in);
        System.out.println("enter your week value");
        String response=op.nextLine();
        day da=day.valueOf(response);
        switch (da) {
            case SUNDAY,
                    MONDAY->System.out.println("gar marao");
                
            case TUESDAY->System.out.println("gandu");
        
            default->System.out.println("nothing");
                
        }


    }
}
