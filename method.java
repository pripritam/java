public class method {
    public static void main(String[] args) {
   
        String name="bro";
        int age=670;

int agee=14;


happy(name,age);

if(agecheck(agee)){
    System.out.println("you are elegible");
}
else{
    System.out.println("not elegible");
}
    }
static void happy(String name,int age){
    System.out.println("happy birthday ");
    System.out.printf("%s\n",name);
    System.out.printf("%d\n",age);
}
static boolean agecheck(int age){
    if (age>=18){
        return true;
    }
    else{
        return false;
    }

}

    
}
