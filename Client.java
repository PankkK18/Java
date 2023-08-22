import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Client
{
	public static void main(String ar[])throws IOException
	{
		int num;
		Scanner sc=new Scanner(System.in);
		Socket s=new Socket("lcoalhost",100);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		System.out.println("Enter any number to get table:");
		num=sc.nextInt();
		dos.writeUTF(""+num);
		System.out.println("\nTable as a response from server:");
		String table=dis.readUTF();
		String table_values[]=table.split(",");
		for(int i=0;i<10;i++)
		{
			System.out.println(num +"X"+(i+1)+"="+table_values[i]);				
		}
		s.close();
	}
}