
import java.util.Scanner;

class Firstclass{
public static void main(String[] args) {
  System.out.println("enter your number\n");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  
  if(num % 2 == 0){
 System.out.println("even\n");
  }
  else{
  System.out.println("add\n");
  }
System.out.println("thank you");
}
}
