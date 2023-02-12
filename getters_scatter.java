//access modifiers
//there are 4 type of access modifiers
//1.private
//2.default
//3.prosted
///4.public

class Myemployeee {
    private int id;
    private String name;

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }

    public void setid(int i) {
        id = i;

    }

    public int getid() {
        return id;
    }

}

public class getters_scatter {
    public static void main(String[] args) {
        Myemployeee varad = new Myemployeee();

        varad.setname("varaddhumale");
        System.out.println(varad.getname());
        varad.setid(18);
        System.out.println(varad.getid());

    }

}
