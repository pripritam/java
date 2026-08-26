class user{
String user;
int value;
user(){
    this.user="pri";
    this.value=9;
}
user(String user){
    this.user=user;
    this.value=9;
}
user(String user,int value){
    this.user=user;
    this.value=9;
}

}
public class overloadconstructor {
    public static void main(String[] args) {
        user op=new user();
        user opp=new user("pri");
        user oppp=new user("ram",9);
        System.out.println(op.user+op.value);
        System.out.println(opp.user+opp.value);
        System.out.println(oppp.user+oppp.value);
        

    }
}
