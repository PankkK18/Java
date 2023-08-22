public class Mian
{
public static void main(String args[])
{
try
{
    int arr[] = new int [5];
	System.out.println("The array is "+arr[5]);
	arr[5]= 10/0;
}
catch(Exception e)
{
System.out.println("exception occur");
}
}
}	
	
    
	