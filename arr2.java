import java .util.Scanner;

public class arr2 {
  
    public static void main(String[] args) {
        
  Scanner op=new Scanner(System.in);

  int number[]={1,2,3,4,5,6};
add(number);




// int ar[]={1,2,3,4};
// arr(ar);
// op.close();

    }

static void add(int... number){
        int sum=0;
        for(int i=0;i<6;i++){
            sum += number[i];
        }
        System.out.println(sum);
    }





    // // static void arr(int ar[]){
    // //     int sum=0;
    // //     for(int i=0;i<4;i++){
    // //         sum+=ar[i];
    // //     }
    // //     System.out.println(sum);
    //  }
        
    }

