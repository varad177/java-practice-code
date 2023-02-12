//Thread by constructor 

class thr extends Thread {
    public thr(String name) {         //new type of Thread;
        super(name);
    }

    public void run() {

        while (true) {
            // System.out.println("i am a thread");
        }
    }
}

public class multithreading3 {
    public static void main(String[] args) {
        thr t1 = new thr("varad");         
        thr t2 = new thr("viha");
        t1.start();
        t2.start();
        System.out.println(" the id of a thread is " + t1.getId());        //.getId ham use krte hai ..ek thread ki id janane ke liye
        System.out.println(" the name  of a name is " + t1.getName());
        System.out.println(" the id of a thread is " + t2.getId());
        System.out.println(" the name  of a name is " + t2.getName());
    }

}
