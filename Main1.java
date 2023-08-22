public class Main1 {
 public static void main(String[] args)
 {
 try{ 
 System.out.println("try Block:: Begin");
 int myArray[]=new int[5]; 
 System.out.println("Array element 10 : " + myArray[10]);
 myArray[5]=10/0; 
 } 
 catch(ArithmeticException e)
 {
 System.out.println("Arithmetic Exception :: Divide by zero!!");
 }
 catch(ArrayIndexOutOfBoundsException e)
 {
 System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");
 } 
 catch(Exception e)
 {
 System.out.println("Exception :: " + e.getMessage ());
 } 
 System.out.println("rest of the code"); 
 } }