
import java.util.Scanner;

class Firstclass3{
public static void main(String[] args) {
   System.out.println("type ur age");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if(age>18){
        System.out.println("can vote");
    }
        else{
            System.out.println("can not vote");
        }
    

 
}
}
