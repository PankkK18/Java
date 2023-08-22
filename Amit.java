// handling exception using try catch block

public class Amit
{
public static void main(String args[])
{
int ar[] = {1,2,3,4,5,6};
try{
for(int i =0 ;i <=ar.length;i++)
{
System.out.println(ar[i]+"");
}
}
catch(Exception e)
{
System.out.println("exception caught");
}
}
}

