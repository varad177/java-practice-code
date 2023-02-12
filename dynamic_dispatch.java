//class banakar ham uska obkect bana skte hai 
//aur subclass banakar bhi uska ham object bana skte hai 
//par agr ek class ho aur uski properties extend ki ho 
//to ham super class ka reference lekar subclass ka object bana skte hai 
//aur agr hamne fynction ko call kiya to subclass ka matlab jiska object hai vo hi run hoga 
//lekin subclass ki method run hone ke liye same method super class me bhi honi chahiye
//it is run time polymorphision

import java.util.jar.Attributes.Name;

class one {
    public void greet() {
        System.out.println("good morning");
    }

    public void name() {
        System.out.println("my name is java");
    }
}

class two extends one {
    public void swagat() {
        System.out.println("apka swagat hai");
    }

    public void name() {
        System.out.println("my name is java in class two");
    }
}

public class dynamic_dispatch {
    public static void main(String[] args) {
        /// one a = new one();
        // a.name();
        one a = new two(); // super class ka reference leke hum subclass ka object bana sakte hai
        // two b = new one(); //par subclass ka reference leke ham super classs ka
        // ibjrect nahi bana skte
        a.greet();
        a.name();

    }

}
