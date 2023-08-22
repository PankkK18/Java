import java.util.Scanner;

class Int
{
String name;
float salary;
void getInput()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Name");
name = sc.nextLine();
System.out.println("Enter Salary");
salary = sc.nextFloat();
}
void shoeData()
{
System.out.println("The name is "+name);
System.out.println("The salary is "+salary);
}
}

public class Uinput

{
public static void main(String args[])
{
Int i = new Int();
i.getInput();
i.shoeData();
}
}

