//method overriding me same method 2 class me hti hain 
//methd overloading me same methdd same class me hoti hai arguments unke alag alag hoti hai

/// IF CHILD CLASS IMPLIMENT THE SAME METHOD PRESENT IN THE PARENTS CLASS THEN IT IS METHOD OVERRINDING 
//static method , final method kom override mahi kar sakte ]

class a
{
    public int meth1()
    {
        return 4;
    }
    public void meth2()
    {
        System.out.println(" i  am a meth 2 of class a");
    }
}
class b extends a{

    @Override             //override ho rahi hai isiliye @override likh sakte hai ,, nahi likhenge tab bbhi chalega 
    public void meth2()                           //same  method hai but 2 class me 
    {
        System.out.println(" i  am a meth 2 of class b");
    }
    public void meth3()
    
    {
        System.out.println(" i  am a meth 3 of class b");
    }

}


public class method_overinding {
    public static void main(String[] args) {
        a a1 = new a();
        a1.meth2();
        b b1 = new b();                    // meth 2 ko b se bhi call karte hai;;;
       // b1.meth2();
        b1.meth2();
    }
    
}
