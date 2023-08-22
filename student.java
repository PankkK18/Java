class student 
{
	int rollno;
	/*student(int rollno)
	{
		rollno = rn;
	}*/
}

class Test extends student 

{
	void Show1()
	{
		System.out.println("the roll no ");
	}
}
		
class Student
{
	public static void main(String args[])
	{
		student s = new student();
		Test t = new Test();
		t.Show1();
	}
}