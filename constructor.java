
class mymainemployee {
    String name;
    int id;

    public mymainemployee(String myname, int myid) { // constructor me ham ek method defined kae dete hAI
                                                     // jiska nam same hota hai MAIN CLASS SE;;;
        id = myid; // constructor means constuct karna
        name = myname;
    }

    public mymainemployee() {
        id = 45;
        name = "varad dhumale";
    }

    public void setname(String n) {
        this.name = n;
    }

    public String getname() {
        return name;
    }

    public void setid(int i) {
        this.id = i;
    }

    public int getid() {
        return id;
    }
}

public class constructor {

    public static void main(String[] args) {
        mymainemployee varad = new mymainemployee("varaddhumale", 20);
        System.out.println(varad.getid());
        System.out.println(varad.getname());

    }

}
