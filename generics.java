class box<t>{
    t item;
    void setitem(t item){
this.item=item;
    }
    t getitem(){
        return this.item;
    }
}
class product<t,u>{
t item;
u price;
product(t item,u price){
    this.item=item;
    this.price=price;
}
t getitem(){
    return this.item;
}
u getprice(){
    return this.price;
}
}
public class generics {
    public static void main(String[] args) {
        box<String> box=new box<>()  ;//same for int ,double etc

        box.setitem("banana");
        System.out.println(box.getitem());



        product<String,Double>product=new product("app", 0.50);
        System.out.println(product.getitem());
        System.out.println(product.getprice());

    }
    
}
