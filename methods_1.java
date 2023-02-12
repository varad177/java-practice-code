import java.util.Scanner;

//just we have to make a function 
//so we can use this multiple times
public class methods_1 {
    static int sum(int x, int y) {

        int z;

        if (x > y) {
            z = x - y;

        } else {
            z = (y - x) * 5;
        }
        return z;

    }

    public static void main(String[] args) {
        int c;
        System.out.println(" enter the value of a & b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        c = sum(a, b);
        int a1 = 8;
        int a2 = 4;

        int c1 = sum(a1, a2);

        System.out.println(c,);
         System.out.println(c1);

    }

}
