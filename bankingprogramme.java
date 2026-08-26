import java.util.Scanner;
public class bankingprogramme {
     static Scanner op=new Scanner(System.in);
    public static void main(String[] args) {
      
        int choice;
        double balence=7.0;
        boolean isrunning=true;
while (isrunning) {
    

        System.out.println("*************");
        System.out.println("banking problem");
        System.out.println("***************");
        System.out.println("1. show balence ");
        System.out.println("2. deposit ");
        System.out.println("3. withdraw ");
        System.out.println("4. exist ");
        System.out.println("**************");
        System.out.print("enter your choice(1-4) : ");
        choice=op.nextInt();
        switch (choice) {
            case 1 ->showbalence(balence);
            case 2 ->balence=balence + deposit();
            case 3 ->balence=balence-withdraw(balence);
            case 4 ->isrunning=false;
            default-> System.out.println("invalid");
        }   
        }
        System.out.println("*****************************************");
        System.out.println("finally done");
        
    }
static void showbalence(double balence){
    System.out.println("**************");
    System.out.printf("$%.2f\n",balence);
}
static double deposit(){
    double amount;
    System.out.println("enter the amount : ");
    amount=op.nextDouble();
    if(amount<0){
        System.out.println("can not be negative");
        return 0;
    }
    else{
        return amount;
    }


}


static double withdraw(double balence){
double amount;
System.out.println("enter the amount to be withdrawal");
amount=op.nextDouble();
if(amount>balence){
    System.out.println("insuuficient money");
}else if(amount<0){
System.out.println("cannot be negative");
}
else{
    return amount;
}

    return 0;
}


    }
    

