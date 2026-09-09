
class dog{
    void speek(){
        System.out.println("BARK");
    }
}
// class talkingdog{
//     void speak(){
//         System.out.println("only english bark");
//     }
// }

public class anonymous_class {
    public static void main(String[] args) {
     dog dog1 =new dog();
    //  dog.speek();   
        dog dog2=new dog(){
            void speek(){
                System.out.println("only englishs bark");
            }
        };
        dog1.speek();
        dog2.speak();


    //  talkingdog talkingdog=new talkingdog();
    //  talkingdog.speak();


    }
    
}
