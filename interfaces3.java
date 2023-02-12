//inheritance in interfaces
//interface se interference extend ho skta hai 
//class se interferencw extend nahi ho skta .... uske liye impliment karna pdta hai 
//interference inherete ho skte hai
interface sampleinterface {
    void meth1();

    void meth2();
}

interface childsampleinterface extends sampleinterface {
    void meth3();

    void meth4();
}

class myclass implements childsampleinterface {
    public void meth1() {
        System.out.println("meth ");
    }

    public void meth2() {
        System.out.println("meth 2");
    }

    public void meth3() {
        System.out.println("meth 3");
    }

    public void meth4() {
        System.out.println("meth 4");
    }
}

public class interfaces3 {
    public static void main(String[] args) {

    }

}
