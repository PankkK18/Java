class Error3
{
public static void main(String  args[])
{
int a = 11 ,b =5 ,c = 5,x,y;
try
{
x =a /(b-c);
}
catch(ArithmeticException e)
{
	System.out.print("Division by error \n");
	
}
y = a/(b+c);
System.out.println("y =" +y);
}
}