// abstract class vechile{
//     abstract void go();
// }

// class car extends vechile{
//     void go(){
//         System.out.println("you drive the car");
//     }
// } 

// class bike extends vechile{
//     void go(){
//         System.out.println("you ride the bike");
//     }

// }

// class boat extends vechile{
//     void go(){
//         System.out.println("you drive boat");
//     }
// }

// public class polymorphism {
//     public static void main(String[] args) {
//         bike bike=new bike();
//         boat boat=new boat();
//         car car=new car();
//         vechile []vechile={car,bike,car};//it is called polymorphism
// for(int i=0;i<vechile.length;i++){
//     vechile[i].go();
// }
        
//     }
    
// }



interface vechile{
    void go();
}

class car implements vechile{
   public void go(){
        System.out.println("you drive the car");
    }
} 

class bike implements vechile{
    public void go(){
        System.out.println("you ride the bike");
    }

}

class boat implements vechile{
  public  void go(){
        System.out.println("you drive boat");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        bike bike=new bike();
        boat boat=new boat();
        car car=new car();
        vechile []vechile={car,bike,car};//it is called polymorphism
for(int i=0;i<vechile.length;i++){
    vechile[i].go();
}
        
    }
    
}
