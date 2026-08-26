class organism{

       boolean isssalive;
    organism(){
        isssalive=true;
    }                    // child-<parent-<grandparent

}
class animal extends organism{

    boolean isalive;
    animal(){
        isalive=true;
    }
void eat(){
    System.out.println("they are eating");
}
}

class dog extends animal{// extends link class dog with class animal
int live=1;
void speak(){
    System.out.println("they bark");
}
}
class cat extends animal{
    int live=9;
    void speak(){
        System.out.println("meow");
    }

}


public class inheritence {
public static void main(String[] args) {
    //inheritence means one class the attributrs and method from another class child<-parent

dog dogy=new dog();
cat catty=new cat();
System.out.println(dogy.isalive);
System.out.println(dogy.live);
System.out.println(catty.isalive);
System.out.println(catty.live);
System.out.println(catty.isssalive+"😁😁😁😁😁");
dogy.eat();
dogy.speak();
catty.speak();


}
    
}
