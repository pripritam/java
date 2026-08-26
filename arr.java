// // class student{
// //     int rollno;
// //     String name;
// //     int marks;
// // }




// //    import java.util.Scanner;           

//                           ////user input one dimensional array
//  public class arr {
//     public static void main(String ar[]) {
// //         int a[]=new int[100];                 //array declearation in java like that way
// //           Scanner op=new Scanner(System.in);
// //  System.out.println("enter a number ");

// // for(int i=0;i<3;i++){
// //      a[i]=op.nextInt();
// // }

// // // for(int i=0;i<3;i++){
// // //      System.out.print(" "+a[i]);
// // // }
// // // System.out.println();

// //                             ///user input two dimensional array


// // //  int b[][]=new int[100][100];
// // //           Scanner opp=new Scanner(System.in);
// // //  System.out.println("enter a number ");

// // // for(int i=0;i<3;i++){
// // //     for (int j=0;j<4;j++){
// // //      b[i][j]=opp.nextInt();
// // // }
// // // }

// // // for(int i=0;i<3;i++){
// // //     for (int j=0;j<4;j++){
// // //      System.out.print(" "+b[i][j]);
// // // }
// // // System.out.println();
// // // }
// //                                                                   //object and class add with array

// // student s1=new student();
// // s1.rollno=1;
// // s1.name="pri";
// // s1.marks=80;

// // student s2=new student();
// // s2.rollno=12;
// // s2.name="pi";
// // s2.marks=90;


// // student s3=new student();
// // s3.rollno=14;
// // s3.name="pritam";
// // s3.marks=40;


// // student students[]=new student[100];
// // students[0]=s1;
// // students[1]=s2;
// // students[2]=s3;

// // for(int i=0;i<3;i++){
// //     System.out.println(students[i].marks+":"+students[i].name+":"+students[i].rollno);
// // }
// //                        //for each loop
// // for(student std : students){
// //     System.out.println(std. marks+":"+std.name+":"+std.rollno);
// // }

//     }
import java.util.Arrays;    
public class arr {
     public static void main(String ar[]) {

String fru[]={"app","gpp","cpp","bpp"};
System.out.println(fru[0]);
System.out.println(fru.length);
// Arrays.sort(fru);
Arrays.fill(fru, "lppp");
for(int i=0;i<fru.length;i++){
    System.out.println(fru[i]);
}

     
     }
    }
