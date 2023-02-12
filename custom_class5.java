//COMPILE TIME POLYMORPHISM
//

class student {
    String name;
    int age;


    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printinfo(int age) {
        System.out.println(age);
    }

    public void printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}


public class custom_class5 {
    public static void main(String[] args) {
        
    
    student varad = new student();
    varad.name="varaddhumale";
    varad.age=20;

    varad.printinfo(varad.age);
    }


    
}
