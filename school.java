class student 
{

}
class test extends student
{
int sub1 = 40;
int sub2 = 38;
void Marks()
{
System.out.println("the marks of the sub1 is "+sub1);
System.out.println("the marks of the sub2 is "+sub2);
}
}
class result extends student
{
void display()
{
//int sub1;
   // int sub2;
//System.out.println("your result is ");
}
}


public class school
{
public static void main(String args[])
{
    test s = new test();
s.Marks();
result t =new result();
t.display();

}
}