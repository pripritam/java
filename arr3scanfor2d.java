// import java.util.Scanner;

// public class arr3scanfor2d {
//     public static void main(String[] args) {

//         Scanner op = new Scanner(System.in);

//            char arr[][]=new char[10][10];
//         System.out.println("Enter 6 characters:");

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//             arr[i][j] = op.next().charAt(0);
//             }
//         }

//         System.out.println("Array:");

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

//         op.close();
//     }
// }




public class arr3scanfor2d {
    public static void main(String[] args) {

        char arr[][] = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


