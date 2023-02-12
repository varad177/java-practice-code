//constructor in inheritance

class base1 {
    base1() {                                 //constructor banaya jiska naam same hota hai class se
        System.out.println("i am a constructor");
    }
    base1(int a) {                                ///argument wala constructor by default run nahi hota 
        System.out.println("i am a constructor with value of a: " + a);
    }
       
}

class derive1 extends base1 {
  
    derive1() {
        super(45);          //base class me argument wala constructor run karne se pehle hame uske derived class me super() kwe ord ka use krna padega

        System.out.println("i am derived class constructor");
    }

   

}

public class inheritance_6 {
    public static void main(String[] args) {

        //base1 b = new base1();
        derive1 d = new derive1();       //derived me base ke properties extend ki hai
                                           //isiliye pehle base ka constructor run hua aur badme derived
    }

}
