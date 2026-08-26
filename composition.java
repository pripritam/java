//represent part of relationship between object ,for example
//an engine is a part of cae
//complex object convert into simple object

class car{
    String model;
    int year;
    engine engine;
    car(String model,int year,String lType ){
        this.model=model;
        this.year=year;
        this.engine=new engine(lType);
    }
    void start(){
        this.engine.start();
        System.out.println(this.model);
      
        
    }
}
  class engine{
    String type;
    engine(String type){
        this.type=type;
    }
void start(){
    System.out.println("nehngoierhgoierhgoierh😒😒😒");
}
}
public class composition {
    public static void main(String[] args) {
        car car=new car("coi", 2025, "v8");
        System.out.println(car.model+" "+car.year+" " +car.engine.type);
        car.start();
       
    }
    
}
