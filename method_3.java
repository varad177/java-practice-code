public class method_3 {
//method overloading

static void foo(){
    System.out.println("good morning varad");
}
static void foo(int a){
    System.out.println("good morning "  + a +   " varad times");
}
static void foo(int a, int b){
    System.out.println("good mornin varad " + a + " times and good morning amu " + b + " times ");
}
    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(200,300);
        //here a and b are parameter and number are actual
    }
}
