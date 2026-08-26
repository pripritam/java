// An ArrayList in Java is a class in the java.util package that implements a dynamic array. Unlike a normal array,
// an ArrayList can grow or shrink automatically as you add or remove elements.

// Features of ArrayList
// Dynamic size (no need to specify the size in advance)
// Stores elements in insertion order
// Allows duplicate elements
// Provides fast random access using indexes
// Slower than arrays for frequent insertions or deletions in the middle



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0);


               list.remove(0);


               list.set(1,34);

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        
        Collections.sort(list);
        System.out.println(list);

        //   ArrayList<String>foods=new ArrayList<>();
        //   for(int i=0;i<3;i++){
        //     System.out.print("enter your food");
        //     String food=op.nextLine();
        //     foods.add(food);
        //   }
        //   System.out.println(foods);

    }
    
}
