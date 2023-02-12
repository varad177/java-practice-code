
//HIERARCHIAL INHERITANCE
Class shape {

    public void area() {
        System.out.println("display area");

    }
}

    class triangle extends shape { // triangle class ne shape ki properties ko extend kar liya //matlab inheritance
                                   // kr liya

        public void area(int l, int h) {
            System.out.println(1 / 2 * l * h);
        }
    }
    class circle extends shape{
        public void area(int r){
            System.out.println(3.14*r*r);
            
        }
    }
    // is me triangle class ki base class hai shape class 
    // aur circle class ki base class hai shape class 



public class inheritance3 {
    
}
