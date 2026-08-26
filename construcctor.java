class student{
    int age;
    String name;
    boolean istrue;
    student(String name,int age){
        this.name=name;
        this.age=age;

        this.istrue=true;
    }
    // student(String n,int a){
    //     name=n;
    //     age=a;


    // }
    void study(){
        System.out.println("gandu😂😂😂😂");
    }
}
public class construcctor {
    public static void main(String[] args){
student op=new student("pri",4);
student opp=new student("pppp",3);
System.out.println(op.name);
System.out.println(opp.name);
System.out.println(opp.istrue);
op.study();
    } 
    
}
