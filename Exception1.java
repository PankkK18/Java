pan
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        
        super(str);  
    }  
}  
    
public class Exception1 {
    static void validate(int age) throws InvalidAgeException
    {
        if(age<18)
        {
        throw new InvalidAgeException("age is not valid");

        }
        else{
            System.out.println("welcome to voting state");
        }
    }
    public static void main(String[] args) {
        try{
            validate(16);
        }
        catch(InvalidAgeException ex)
        {
            System.out.println("caugth the exception");

            System.out.println("Exception occured at "+ex);
        }
        System.out.println("rest of the code");
    }
    
}
