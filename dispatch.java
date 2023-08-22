class OA
{
    void callme()
    {
        System.out.println("Inside OA call me method");
    }
}
class OB extends OA
{

        void callme()
        {
            System.out.println("Indide OB callme method");
        }
}
class OC extends OA{
    void callme()
    {
        System.out.println("Inside OC callme method");
    }
}

public class dispatch {
    public static void main(String[] args) {
        OA a =new OA();
        OB b = new OB();
        OC c = new OC();
        OA r ;
        r =a ;
        r.callme();
        
        r = b ;
        r.callme();

        r = c ;
        r.callme();
        
    }
}
