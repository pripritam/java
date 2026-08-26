import java.util.Scanner;
import java.util.Random;
public class rockpapersizer {
    public static void main(String[] args) {
    Scanner op=new Scanner(System.in);
    Random opp=new Random();




    String choice[]={"rock","paper","scissor"};
    String playagain;
    do{

    System.out.println("enter your move (rock paper sizer) : ");
    String playerchoice=op.nextLine();
   if(!playerchoice.equals("rock") && 
                    !playerchoice.equals("paper")&&
                            !playerchoice.equals("scissor") ){

            System.out.println("invalid");                    
   }


String computerchoice=choice[opp.nextInt(3)];
System.out.println("computer choice: "+computerchoice);
if(playerchoice.equals(computerchoice)){
    System.out.println("it is a tie");
}
else if(playerchoice.equals("rock")&& computerchoice.equals("paper") ||
        playerchoice.equals("paper")&& computerchoice.equals("scissor")||
        playerchoice.equals("scissor")&& computerchoice.equals("rock")){
    System.out.println("you win");
}else{
    System.out.println("you lose");
}

System.out.println("play again (yes/no): ");
 playagain=op.nextLine();
}
while(playagain.equals("yes"));

    }
}
