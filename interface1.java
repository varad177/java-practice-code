//inteerface 
//abstract base class ka reference lekar child class ka abject bana skte hai ham
// interface matlab 
//abstract me ham extends keyword ka use karte hai pr interfaces ham >>>impliments<<< keywird ka use karte hai 
//interface class me ham jitni methods banayenge to un sbki concret body subclass me banani padti hai 
//multiple interface ka use karke ek class bana skte hai 

interface bycycle {
    int a = 100; // interface me likhi hui value final hoti hai

    void applybreake(int decrement); /// ye dono methods hame subclass me defined kaene hi padenge

    void speedup(int increament);

}

class vrdcycle implements bycycle {
    void blowhorn() {
        System.out.println("pee pee poo poo");
    }

    public void applybreake(int decrement) { // subclass me method >>>public<<< hoti hai
        System.out.println("applying break");
    }

    public void speedup(int increament) {
        System.out.println("applying speedup");
    }

}

public class interface1 {
    public static void main(String[] args) {
        vrdcycle v = new vrdcycle(); /// subclass ka reference leker subclass ka object nanana padta hai
        v.applybreake(1);
        System.out.println(v.a);

        // bycycle c = new bycycle(); //inter ka object nahi bana skte

    }

}
