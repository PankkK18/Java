class InvalidInputException extends Exception
{
public InvalidInputException(String str)
{
super(str);
}
}

class JavatPoint1
{
static void validate(int input) throws InvalidInputException
{
if(input<=18)
{
throw new InvalidInputException("Input is not valid");
}
else
{
System.out.println("Have Great Time...!");

}
}
public static void main(String args[]) 
{

try
{
validate(17);
}
catch(InvalidInputException e)
{
System.out.println("Yeahh boiii..! Got you...\n"+e);
}
System.out.println("Rest of the code");
}
}






