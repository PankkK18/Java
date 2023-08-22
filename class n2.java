import java.net.*;
class n2
{
	public static void main(String args[])throws
	MalformedURLException
	{
		URL ul=new URL
		("http://http://pheonixglobe.com/testing.html");
		System.out.println("Protocol is:"+ul.getProtocol());
		System.out.println("Port is :"+ul.getPort());
		System.out.println("Host is :"+ul.getHost());
		System.out.println("File is :"+ul.getFile());
		System.out.println("String Representation:"+ul.toString());
		System.out.println("Path is:"+ul.getPath());
	}
}