//multithreading by extending thread
//

class thread1 extends Thread { // threading me run hone ke liye ,,, class ko Thread class se extends hona padta
                               // hai

    public void run() {
        while (true) {
            System.out.println("thread 1 is running");
            System.out.println("i am happy");

        }

    }

}

class thread2 extends Thread {

    public void run() {
        while (true) {
            System.out.println("thread 2 is running");
            System.out.println("i am sad");

        }

    }

}

public class multithreading1 {
    public static void main(String[] args) {
        // fun1(); //ye function suppose thread me run ho rahi hai
        // fun2(); //ye bhi function thread me run ho rha hai
        // aur yha bakika code likha hua hai
        // to yaha pr fun1 & fun2 sab kuch ek sath run honge '//aur baki ka code bhi
        // simultanaously run hota hai'

        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start(); /// Thread class ko run karne ke lite object ko .start() method se run krna
                    /// padta hai
        t2.start();

        // yaha par dono method eksath run honge ..
        // isme Thread class kuchh time thread1 ko deta hai
        // aut Thread class kuchha time thread2 ko deta hai ...
        // aur dono ek time pr execute hote hai
        // par simultaneously nahi hote ,,, ek time pr ek method run hota hai ...
        // par attend dono hote hai ...au
        // aur execution faster hota hai
    }

}
