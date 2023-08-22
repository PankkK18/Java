public class multiCatch
{
public static void main(String args[])
{
   try
   {
      int ar[] = {1,2,3,4,5,6};
	  System.out.println("Array out of bound"+ar[5]);
	  int a = 0 ;
	  int b= a/0;
	  for(int i = 1 ; i<=ar.length;i++)
	  {
	  System.out.println("jhsvdfjhsbdfnsbfnsdbf");
	  }
	
   }
	catch(ArithmeticException q )
     {
		System.out.println("exception occur");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	  System.out.println("divideByZero");
	}
	finally
	{
	System.out.println("IN finally");
	}
}
}
	  