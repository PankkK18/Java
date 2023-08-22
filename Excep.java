 class Bank
{
	public void withdraw()
	{
		System.out.println("LowBalanceException");
	}
	public void deposit()
	{
		System.out.println("NegativeNumberException");
	}
}

public class Excep
{
public static void main(String args[])
{
try
{
Bank b = new Bank();
b.withdraw();
b.deposit();
}
catch(ArithmeticException  lb)
{
	System.out.println(" the Amount of Balance is low");
}
catch(NullPointerException n)
{	
	System.out.println(" THe amount of Balance is negative");
}
finally
{
	System.out.println("InFinallyBlock");
}
}
}