class ThrowDemo
{
static void demopc()
{
try
{
throw new NullPointerException("demo");
}
catch(NullPointerException e)
{
System.out.println("Caught inside demopc");
 throw e ;
 }
 }
 public static void main(String args[])
 {
 try{
 demopc();
 }
 catch(NullPointerException e)
 {
 System.out.println("Recaught"+e);
 }
 }
}