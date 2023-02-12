import shape.triangle;

//>>>MULTILEVEL INHERITANCE<<<
//is me ek se jyada classes banengi

class shape {

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




class equilateraltriangle extends triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class inheritance2 {
    
}
