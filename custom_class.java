import javax.swing.plaf.synth.SynthOptionPaneUI;

class employee {
    int age;
    String name;
    int salary;
    public void printdetails()   
     {
     System.out.println("my age is " + age);
     System.out.println("my name is - " + name);
     System.out.println("the salary is "+salary);
     }

}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("the custom class");
        employee varad = new employee(); // instantiating new employee object
        employee amu = new employee();

        // setting properties
        //for amu
        amu.age=45;
        amu.name= "amruta dhumale";
        amu.salary = 450;
        //for varad
        varad.age = 20;
        varad.name = "varad the super star";
        varad.salary=750;
        // printing properties
       // System.out.println(varad.age);
        //System.out.println(varad.name);
       
        //varad.printdetails();
        amu.printdetails();
    }

}
