//inheritance 
//ek class ki properties dusre class me inheritate ki ja sakti hai
//iske liye extends key word ka use hota hai


class base{

    int x;
    public void setx(int x)
    {
        this.x=x;
    }

    public int getx()
    {
        System.out.println(" i am in base and setting x");
        return x;
    }


    public void printme()
    {
        System.out.println(" I am a constructor");
    }
}

class derive
{
    int y;
    public void sety(int y)
    {
        System.out.println(" iam in derive and setting y");
        this.y = y;
        
    }

    public int gety()
    {
        return y;

    }
    public void printme()
    {
        System.out.println(" I am a derived class");
    }

}
public class inheritance_4 {
    
    public static void main(String[] args) {
        base b = new base();
       // b.setx(4);
        System.out.println(b.getx());
        derive d = new derive();
        d.sety(3);
        System.out.println(d.gety());
        
    }
}
