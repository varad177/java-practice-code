class thr4 extends Thread {

    public void run() {

        while (true) {
            System.out.println("thank you");

        }

    }
}

class thr5 extends Thread {

    public void run() {
        while (true) {
            System.out.println("welcome");
            try {
                Thread.sleep(200); // .sleep() se perticular Thread kuch milliseconds ke liye sleep matlab run hona
                                   // band hota hai
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }
}

public class multithreading6 {
    public static void main(String[] args) {
        thr4 t1 = new thr4();

        thr5 t2 = new thr5();
        t1.start();
        try {
            t1.join(); //// join likhnese pehle t1 run hoga ,,aur jab t1 ka kam KHATAM hoga to t2 run
                       //// hona shuru hoga
        } catch (InterruptedException e) { // ye exception provide kr rha tha isiliye ise try & catch me likh diya ;;;

            System.out.println(e);
        }
        t2.start();

    }

}
