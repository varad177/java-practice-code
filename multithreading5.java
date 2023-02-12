
//methods  in multithreading
//join() method ko dekhenge

class thr2 extends Thread {

    public void run() {
        int i =0;
        while (i<2000) {
            System.out.println("thank you");
            i++;
        }

    }
}

class thr3 extends Thread {

    public void run() {
        while (true) {
            System.out.println("welcome");
        }

    }
}

public class multithreading5 {
    public static void main(String[] args) {
        thr2 t1 = new thr2();

        thr3 t2 = new thr3();
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
