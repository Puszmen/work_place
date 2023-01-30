import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class SerwletKrasomowczy extends HttpServlet { 
  public void doGet (HttpServletRequest zadanie, HttpServletResponse odpowiedz) throws  ServletException, IOException  {
  	PrintWriter out;
  	String tytul = "Krasomówca wygenerował następujące zdanie.";
    odpowiedz.setContentType("text/html");
    out = odpowiedz.getWriter();

    out.println("<HTML><HEAD><TITLE>");
    out.println("Krasomówca");
    out.println("</TITLE></HEAD><BODY>");
    out.println("<H1>" + tytul + "</H1>");
    out.println("<P>" + Krasomowca.tworzZdanie());
    out.println("<P><a href=\"ServletKrasomowczy\">wygeneruj inne zdanie</a></p>");
    out.println("</BODY></HTML>");
        
    out.close();
  }
}
