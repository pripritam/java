class car{
    String make;
    String model;
    String year;
    car(String make, String model,String year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

       public String toString(){
            return this.make+" "+this.model+" "+this.year;
        }
    }
   


public class tostring {
    public static void main(String[] args) {
        car carr=new car("mastung","ford","yelloe");
       System.out.println(carr);//acess object attribute directly for that reason use string tostring
        

    }
    
}
