import java.util.Scanner;
import java.util.Random;;


public class diceroll {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        Random opp=new Random();
        int noofdice;
        int total=0;
        System.out.print("enter the no of dice to be roll :");
        noofdice=op.nextInt();
        if(noofdice>0){
            for(int i=0;i<noofdice;i++){
                int roll=opp.nextInt(1,7);
                System.out.println("you rolled " + "  " + roll);
                printdie(roll);
                
                total= total + roll;
            }
            System.out.println("total" +" " +total);
        }
else{
    System.out.println("not valid");
}
         
    }
static void printdie(int roll){
    String dice1="""
             -------
            |       | 
            |    .   | 
            |       | 
            |       | 
             -------
            """;
    String dice2="""
             -------
            |       | 
            |    .   | 
            |  .     | 
            |       | 
             -------
            """;
    String dice3="""
             -------
            |       | 
            |    .   | 
            |  .     | 
            |     .  | 
             -------
            """;
    String dice4="""
             -------
            |  .     | 
            |    .   | 
            | .      | 
            |      . | 
             -------
            """;
    String dice5="""
             -------
            | .      | 
            |    .   | 
            | .      | 
            |   .   . | 
             -------
            """;
    String dice6="""
             -------
            |  .  .   | 
            |    .   | 
            | .  .    | 
            |      . | 
             -------
            """;
switch (roll) {
  case 1->System.out.println(dice1);
  case 2->System.out.println(dice2);
  case 3->System.out.println(dice3);
  case 4->System.out.println(dice4);
  case 5->System.out.println(dice5);
  case 6->System.out.println(dice6);

    default->System.out.println("nothing found");
        
}
    
}
}