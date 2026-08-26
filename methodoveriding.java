
class animal {

void move(){
    System.out.println("it is moving");
}
}

class dog extends animal{

}
class cat extends animal{

}
class fish extends animal{
  

}

public class methodoveriding {
    public static void main(String[] args) {
        dog dog=new dog();
        cat cat =new cat();
        fish fish =new fish();
        dog.move();

    }
    
}
