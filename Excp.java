public class Excp
{
public static void main (String args[])
{
try 
{
System.out.println("Try Block:End");
int myArray[]= new int[5];
System.out.println("Array element 10:"+myArray[1]);
myArray[1] = 10/0;
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException :: DivideBy zero!!");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBoundsException :: Accessed index out of bounds");
}
catch(Exception e)
{
System.out.println("Exception :: ");
}
System.out.println("rest of the code");
}
}
x