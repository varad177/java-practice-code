import java.util.Timer;

import shape.triangle;

//inheritance
//ek class kki poperties jab koi dusri class lena chahti hai, to us process ko kehte hai INHERITAMCE
//jis class se properties li jati hai - us class ki BASE class kehte hai;
//jo class properti leti hai - us class ko kehte hai CHILD class;


//>>>SINGLE LEVEL INHERITANCE<<<<
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



public class inheritance {
    public static void main(String[] args) {
        triangle t1 =new triangle();
       
    }

}
