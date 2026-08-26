abstract class shape{
abstract double area();//abstract method
void display(){//concrete method
    System.out.println("this is a shape");
}
}
class circle extends shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
double area(){
    return Math.PI*radius*radius;
}
}
class triangle extends shape{
    double base;
    double height;
     triangle(double base,double height){
      this.base=base;
      this.height=height;
    }

double area(){
    return 0.5*base*height;
}

}
class rectangle extends shape{
    double length;
    double width;
    rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }


double area(){
    return length*width;
}
}
public class abstraction {
    public static void main(String[] args) {
    //    shape shape= new shape();
    //   can not create shape object beacuse shape is a abstract type for abstract no object is make  
       circle circle=new circle(3);
       triangle triangle=new triangle(4,5);
       rectangle rectangle=new rectangle(6,7);
circle.display();

System.out.println(circle.area());
System.out.println(triangle.area());
System.out.println(rectangle.area());

    }
    
}
