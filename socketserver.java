import java.io.*;
import java.net.*;

public class socketserver{

    public static void main(String[] args){

        try{

            ServerSocket ss=new ServerSocket(6666);

            Socket s=ss.accept();//establishes connection

            DataInputStream dis=new DataInputStream(s.getInputStream());

            DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            int n1=Integer.parseInt(dis.readUTF());

            int n2=Integer.parseInt(dis.readUTF());
            int sum;
            sum =n1+n2;

            dout.writeUTF(""+sum);

            ss.close();

        }catch(Exception e){System.out.println(e);}

    }

}
