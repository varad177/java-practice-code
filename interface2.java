//default method
//static mathod ek object se associated nahi hota vo ek class or interference se associated hota hai 
////default methods enable us to add new functionality to existtance interference

interface camera {
    void takesnap();

    void recordvideo();

}

interface wifi {
    String[] getnetwork();

    void connecttonetwork(String Network);

}

class cellphone {
    void callnumber(int number) {
        System.out.println("calling : " + number);
    }

    void pickcall() {
        System.out.println("connecting.....");
    }
}

class smartphone extends cellphone implements wifi, camera {
    public void takesnap() {
        System.out.println("taking snap");
    }

    public void recordvideo() {
        System.out.println("recording ");
    }

    public String[] getnetwork() {
        System.out.println("the network list");
        String[] networklist = { "varad", "amu", "ankita" };
        return networklist;
    }

    public void connecttonetwork(String network) {
        System.out.println("connecting to" + network);
    }

}

public class interface2 {
    public static void main(String[] args) {
        smartphone ms = new smartphone();
        String[] ar = ms.getnetwork();
        for (String item : ar) {
            System.out.println(item);
        }

    }

}
