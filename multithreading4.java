//Thread priorities
//konsa thread kab run hoga . kisiko kitini priorities milegi
//
//Thread by constructor 

class thr1 extends Thread {
    public thr1(String name) { // new type of Thread;
        super(name);
    }

    public void run() {

        System.out.println("th is" + this.getName());
        // while (true) {

        // System.out.println("i am a thread");
        // }
    }
}

public class multithreading4 {
    public static void main(String[] args) {
        thr1 t1 = new thr1(" varad1");
        thr1 t2 = new thr1(" varad2");
        thr1 t3 = new thr1(" varad3");
        thr1 t4 = new thr1(" varad4");
        thr1 t5 = new thr1(" varad5  most imp"); /// is object ko hame pehle run karna hai
        t5.setPriority(Thread.MAX_PRIORITY); // is ko use krke ham kisi nhi function ko priority de skte hai;;;
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
