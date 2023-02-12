class pen{
    String pen;
    String color;
    String type; //jel or ball pen
   
   
    public void write(){
     System.out.println("write something");
   }
   
   
   public void printcolor() {
    System.out.println(this.color);

    }
}
 

public class custom_class2 {
   public static void main(String[] args) {
    pen pen1 = new pen();
    pen1.color = "blue";
    pen1.type = "jel";

    pen1.write();

    pen pen2 = new pen();
    pen2.color= "black";
    pen2.type="ball pen";

    pen1.printcolor();
    pen2.printcolor();

    


        
    }
    
}
