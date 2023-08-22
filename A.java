//palindrome number pankaj ghuge
import java.util.Scanner; 

class A
{
public static void main(String args[])
{
int n,s=0,r,c;
System.out.print("Enter value ");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
c=n;


while(n>0)
{
r=n%10;//remainder calculate
s= (s*10)+r;
n = n/10;


}
if(c==s)
{
	System.out.print("Palindrome Number");
	
}
else{
	System.out.print("Not palindrome");
	
}

}

}

