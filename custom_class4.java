class vd {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    vd(String name, int age) {

        this.name = name;
        this.age = age;
    }

}

public class custom_class4 {
    public static void main(String[] args) {

        vd vrd = new vd("varad", 22);

        vrd.printinfo();

    }

}
