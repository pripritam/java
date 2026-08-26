 //when use private it is this which can not be acess 
 // so use getter method to acess or read the particular private things 
 //setter is used to write or update the data when it is private


 class car {
    
   private String model;
    private String colour;
    private int price;
car(String model,String colour,int price){
    this.model=model;
    this.colour=colour;
    this.price=price;
}
String getmodel(){
    return this.model;
}
String getcolour(){
    return this.colour;
}
int getprice(){
    return this.price;
}


void setcolour(){
    this.colour="blue";
}

void setprice( int price){
    this.price=price;
}

}

public class getters_setters {
    public static void main(String[] args) {
        car car=new car("mus", "yellow", 4500);
         System.out.println(car.getmodel());
        System.out.println(car.getcolour());
        System.out.println(car.getprice());//gretter part


        // car.setcolour("blue");
        car.setcolour();
        car.setprice(100000);
        System.out.println(car.getmodel());
        System.out.println(car.getcolour());
        System.out.println(car.getprice());//setter part
      

    }
    
}
