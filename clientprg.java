import java.io.*;  
import java.net.*;  
import java.util.*;
public class clientprg
{  
public static void main(String[] args) 
	{  
	try
		{      
		Socket s=new Socket("localhost",6666);  

		Scanner sc= new Scanner(System.in);

		DataInputStream dis=new DataInputStream(s.getInputStream());
	
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  

		System.out.println("No1:");
		int n1=sc.nextInt();
		System.out.println("No2:");
		int n2=sc.nextInt();
	


		dout.writeUTF(""+n1);  
		dout.writeUTF(""+n2);  
		int sum;
		sum=Integer.parseInt(dis.readUTF());

		System.out.println("Sum is:"+sum);


		dout.flush();  
		dout.close();  
		s.close();  
		}
		catch(Exception e){System.out.println(e);}  
	}  
}
