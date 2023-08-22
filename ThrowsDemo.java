class ThrowsDemo
{
static void throwone()throws IllegalAccessException
{
System.out.print("Inside throw one");
Throw IllegalAccessException("demo");
}
public static void main(String args[])
{
try{
throwone();
}
catch(IllegalAccessException e)
{
System.out.println("caught "+e);
}
}
}