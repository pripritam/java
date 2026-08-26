class friend{
    String name;
     static int numoffriend;//static means make  a variable or method belong to a class not a object you can acess it by class name
    friend(String name){
        this.name=name;
        numoffriend++;
    }
    static void showfriend(){
        System.out.println("you have"+" "+numoffriend);
    }
}

public class statickeyword {
    public static void main(String[] args) {
        
friend f1=new friend("pri");
friend f2=new friend("ram");
friend f3=new friend("shyam");

// System.out.println(f1.numoffriend);
// System.out.println(f2.numoffriend);
// System.out.println(f3.numoffriend);
//all give 1 beacuse they are in diff object

System.out.println(f1.numoffriend);
System.out.println(friend.numoffriend);
friend.showfriend();
System.out.println(Math.round(2.99));


    }

    
}
