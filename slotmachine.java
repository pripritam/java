import java.util.Scanner;
import java.util.Random;
public class slotmachine {
    public static void main(String[] args) {
    Scanner op=new Scanner(System.in);

int balence=100;
int bet;
int payout;
String row[];


System.out.println("  welcome to java slot  ");
System.out.println("symbols: 🍒 🍉 ❤️ 🔔 ⭐");
while(balence>0){
    System.out.println("current balence: $ "+balence);
    System.out.println("place your bet amount :");
    bet=op.nextInt();
    op.nextLine();
    if(bet>balence){
        System.out.println("indufficient money");
    }
    else if(bet<=0){
        System.out.println("invalid money");
    }
    else{
        balence-=bet;
    }

System.out.println("spinning....");
  row=spinrow ();
  System.out.println("*************");
  System.out.println((row[0] +" | "+row[1]+ " |" +row[2]));
  System.out.println("******************");
payout=getpayout(row,bet);
            if(payout>0) {
            System.out.println("you won : "+ payout);
            balence+=payout;
            }
            else {
                System.out.println("you do not get anything");
            }


System.out.println("do you want to play again?(Y/N) :");
String playagain=op.nextLine();
                if(!playagain.equals("y")){
                    break;
                }

}


System.out.println("finally game is over and " +"you have total money" +" "+ "$"+balence);


    
    }
    static String[] spinrow(){   ///// array use as a function
        String symbol[]={"🍒", "🍉", "❤️", "🔔", "⭐"};
        String row[]=new String[3];// row is a empty array that hold 3 string value
        
          Random opp=new Random();
          for(int i=0;i<3;i++){
            row[i]=symbol[opp.nextInt(5)];
          }
            //   System.out.println( (row[0]+row[1]+row[2]));
            return row;   //when return only write array name not use array symbol

    }

static int getpayout(String row[],int bet){

       if(row[0].equals(row[1]) &&row[1].equals(row[2]) ){
                return switch(row[0]){
                        case "🍒"->bet*3;
                        case "🍉"->bet*4;
                        case "❤️"->bet*5;
                        case "🔔"->bet*6;
                        case "⭐"->bet*7;
                        default->0;
                };
        }
      else if(row[0].equals(row[1]) ){
                return switch(row[0]){
                        case "🍒"->bet*2;
                        case "🍉"->bet*1;
                        case "❤️"->bet*4;
                        case "🔔"->bet*9;
                        case "⭐"->bet*5;
                        default->0;
                };
        }
       else if(row[1].equals(row[2]) ){
                return switch(row[1]){
                        case "🍒"->bet*2;
                        case "🍉"->bet*6;
                        case "❤️"->bet*8;
                        case "🔔"->bet*1;
                        case "⭐"->bet*5;
                        default->0;
                };
        }
        else{
            System.out.println("3 string not match");
        }

    return 0;
}
}