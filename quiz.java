import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
String questions[]={"what is functiom of a router",
                    "which part of computer is consider as a brain",
                    "what year facebook was launched",
                    "who is known as father of computer",
                "what was the first programming language"};
                        

String options[][]=
   {{"1.storing","2.encrypting","3.directing","4.manage password"},
    {"1.cpu","2.hard","3.ram","4.rom"},
    {"1.2000","2.2004","3.2006","4.2008"},
    {"1.pri","2.cahrls babbas","3.sham","4.jodu"},
    {"1.cobol","2.c","3.fortran","4.assembly"}};
    
int ans[]={3,1,2,4,3};
int score=0;
int guess;
System.out.println("******************");
System.out.println("welcome in quiz game ");
System.out.println("**************************");
for(int i=0;i<questions.length;i++){
    System.out.println(questions[i]);

    // for(int j=0;j<4;j++){
    // System.out.println(options[i][j]+ "  ");
  
    // }
    for(int j=0;j<options[i].length;j++){
    System.out.println(options[i][j]+ "  ");
    }
    System.out.println("enter youe guess : ");
    guess=op.nextInt();
    if(guess==ans[i]){
        System.out.println("************");
        System.out.println("correct");
        System.out.println("************");
        score++;
    }

    
    else{
        System.out.println("maderchod");
    }
}   
 


System.out.println("your final score is "+ score +" out of"+questions.length);
}


}

    

