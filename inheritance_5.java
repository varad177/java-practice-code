//constructor in inheritance

class base1 {
    base1() {                                 //constructor banaya jiska naam same hota hai class se
        System.out.println("i am a constructor");
    }

       
}

class derive1 extends base1 {
    derive1() {
        System.out.println("i am derived class constructor");
    }

   

}

public class inheritance_5 {
    public static void main(String[] args) {

        base1 b = new base1();
        derive1 d = new derive1();       //derived me base ke properties extend ki hai
                                           //isiliye pehle base ka constructor run hua aur badme derived
    }

}
