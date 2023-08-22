import  java.net.*;
import java.io.*;
public class Server
{
	public static void main(String ar[])throws IOException
	{
		ServerSocket ss= new ServerSocket(100);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		String value= (String)dis.readUTF();
		int num=Integer.parseInt(value);
		String table="";
		int temp=0;
		for(int i=1;i<10;i++)
		{
			temp=num*i;
			table=table+temp+",";
		}
	dos.writeUTF(table);
	s.close();
	s.close();
	}
}