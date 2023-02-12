class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class custom_class3 {
    public static void main(String[] args) {
        Student varad = new Student();
        varad.name = "varaddhumale";
        varad.age = 20;

        varad.printinfo();

    }

}
