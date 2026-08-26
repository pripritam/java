class person{
String first;
String last;
boolean istrue=true;
person(String first,String last){
    this.first=first;
    this.last=last;
}
void showname(){
System.out.println(first +" "+ last);
}
}
class student extends person{
    double gpa;
    student(String first,String last,double gpa){
        super(first,last);
        this.gpa=gpa;
    }
}
public class superr {
    public static void main (String[]args){
        // refers to the parent class ,used in constructor and method overriding
        //calls the parent constructor to initialize attribute
        person op=new person("tom", "jerry");
        op.showname();
        student opp=new student("h","p",98);
         
        opp.showname();
        System.out.println(opp.istrue);
        
          
    }

    
}
