package flappyBird;

import java.net.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;

class clientFile {
    public static void main(String args[])
    UnknownHostException,IOException
    {
        Socket clientobj = new Socket("localhost",1000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter filename to read data:");
        String filenm = br.redaLine();
        OutputStream osobj= clientobj.getOutputStream();
        DataOutputStream dosobj =new DataOutputStream(osobj);
        dosobj.writeUTF(filenm);

        InputStream inputobj=clientobj.getInputStream();
        DataInputStream disobj=new DataInputStream(inputobj);
        String msg = disobj.readUTF();


        if(!msg.equals("No"));
        {
            System.out.print("File Contenet are:");
            System.out.println(msg);
        }

        System.out.print("File not Presrnt");
        disobj.close();
        dosobj.close();
        clientobj.close();
        br.close();
    }
}