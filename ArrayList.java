import java.util.Collection;

//ARRAYLIST
//SIZE can be varry
//we can add lots of elements
//in ARRAYLIST we can store primitives; i.e  int & floate
//ARRAYLIST Heap ke andar banti hai;
/*
 some oparations
 1. add
 2.get
 3.modified
 4. delete/ remove;
 5.iterate/ performing oparation
 */
// ARRAYLIST impliment krne se pehle ek package ko import krna padta hai jiska nam hai <java.util.ArrayList>

//BASICALLI SEARCH KE LIYE ARRAYLIST USE KRTE HAI
import java.util.*;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        // ADD ELEMENTS
        list.add(0); // elements ko hamne ADD kiya ;;
        list.add(1);
        list.add(4);

        System.out.println(list);

        // GET ELEMENTS

        int element = list.get(2); // elements get kar diya ... badme use element me save kiya aur use . print kr
                                   // diya ;;;
        System.out.println(element);

        // ADD ELEMENT IN BETWEEN
        list.add(2, 50); // in between add krne ke liye hamne () me pehle index li position add kr li aur
                         // badme elements add kar diya;;
        System.out.println(list);

        // SET ELEMENTS
        // set me ham pehle wale index ko change kr dete hai;;

        list.set(1, 40); // index 1 pe hamne 40 add kr diya;;
        System.out.println(list);

        // DELETE ELEMENTS
        list.remove(2); // index 2 matlab 3rd position wala element hamne remove kr diya ;;
        System.out.println(list);

        // HOW MANY ELEMENTS ARE STORE IN ELEMENTS ;;
        // SIZE
        int size = list.size();
        System.out.println(size);

        // ITERATE KARNA
        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // SORTIG
        // ASSENDING OR DECENDING ORDER ME ARRENGE KRANA MATLAB SORTING KARNA ;;
        // ISME AUTOMATICALLY HAM ARRAY KO ASSENDING ORDER ME ARRENGE KR SAKTE HAI;;
        // SO THE FUNCTIONS IS

        Collections.sort(list); // is function se arraylist assending order me print ho jati hai;;

        System.out.println(list);

    }

}
