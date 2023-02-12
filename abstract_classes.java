//abstract classes and interference
//abstract matlab jo ki khayal mai hai man me hai ,,,jiska koi physical concreat existance nahi hota  nahi hota 
//abstract method thet is declear without an implimentation
//abstract matlab jisme abstract method ho 
//abstrct class me ham ek khali method bana te hai jo ki ham uske child class me runnable krte hai
//abstract class bananeke bad hame uski uski subclass concreat banani hoti hai
abstract class base
{
    public base(){
        System.out.println("mai base base ka constructor hoo");
    }

    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
    
}

class derived extends base{
    @Override
public void greet(){
    
    System.out.println("good morning");
}
    
}



public class abstract_classes 
{
    public static void main(String[] args)
    {
        //base b = new base() ;                 //abstract class ka abject nahi bana skte 

      //derive a = new derive();
      //a.greet();
      base c = new derived();
      c.greet();
      

    }

}
