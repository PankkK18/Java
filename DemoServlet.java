import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet extends HttpServlet
{
    public void doGet(HttpRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        res.setContentType("text/html");//setting the conetent type//
        PrintWriter pw= res.getWriter();//get the stream to write the data 
        //writing html in the Stream//
        pw.println("<html><body>");
        pw.println("Welcome to Srvlet");
        pw.println("</body></html>");
        pw.close();//closing the stream


    }
}
