///collection frame work ko use krke classes hame pehle hi mil jati hai
// classes scraches se nahi banani padti
// code pura available hota hai ..sift un tool ko use karna hota hai;;;

import java.lang.invoke.VarHandle.VarHandleDesc;
import java.util.*;

public class LL_COLLECTION_FRAMEWORL {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("is");
        list.addFirst("varad");
        list.addFirst("a");
        list.addLast("good");

        System.out.println(list.size());

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "-->"); // .get ham likhate hai jab hame element chahiye hota hai;;
        }
        System.out.println(" ");

        // list.removeFirst();
        // list.removeLast();
        // System.out.println(list);
        list.remove(3);

        System.out.println(list);

    }
}
