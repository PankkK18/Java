class MycustomException extends Exception
{





}


public class TestCustomException3
{
	public static void main(String args[])
	{
		try
		{
			throw new MycustomException();
			
		}
		catch(MycustomException ex)
		{
			System.out.println("Caught The Exception");
			System.out.println(ex.getMessage());
		}
		
		
		System.out.println("rest of the code");
	}
}
		
