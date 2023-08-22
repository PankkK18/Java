interface bbike
{
    void start();
    
}
class fz implements bbike{
    public void start()
    {
        System.out.println("auto start");
    }
    
}
class passion implements bbike{
     public void start()
    {
     System.out.println("manual start");   
    }
}
public class Interfacebike{
    public static void main(String[] args) {
        
        fz f= new fz();
        f.start();
        passion p = new passion();
        p.start();
    }
}
