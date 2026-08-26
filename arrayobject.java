class car{
    String name;
    String colour;

    car(String name ,String colour){
        this.name=name;
        this.colour=colour;

    }
    void disply(){
        System.out.println(name + colour);

        System.out.println("🍌🍌🍌🍌🍌🍌");
    }
}


public class arrayobject {
    public static void main(String[] args) {
        car car1=new car("mustuang","red");
        car car2=new car("mus","yellow");
        car car3=new car("nano","pink");

         car[] cars={car1,car2,car3};
        //  car cars[]={car1,car2,car3};
         for(int i=0;i<3;i++){
           cars[i].colour="black";
         }
         for(int i=0;i<3;i++){
           cars[i].disply();
         }
         
    }
    
}
