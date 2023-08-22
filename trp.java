import java.util.Scanner;
interface bAnk
{
    void getinterest();
}
class lokmangal implements bAnk{
    public void getinterest()
    {
        System.out.println("interest rate is 5%");

    }

}
class DCC implements bAnk 
{
   public void getinterest()
   {
    System.out.println("interest rate is 4%");
   }
   void Loan()
   {
    System.out.println("if you want you can get loan ");
   }
}
public class trp {
    int age;
    
 public static void main(String[] args) {
    int i ,j ;

    

        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the age");
        i = sc.nextInt();
        System.out.println("enter the age ");
        j= sc.nextInt();
int c = (i+j)%2;
System.out.println("average of ages is " +c);

        
    bAnk d = new DCC();
    d.getinterest();
    

    
    
 }   
}
