import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MojSerwletA extends HttpServlet {
	
  public void doGet(HttpServletRequest zadanie, HttpServletResponse odpowiedz) throws ServletException, IOException {
    odpowiedz.setContentType("text/html");
    PrintWriter out = odpowiedz.getWriter();
    
    String komunikat = "Jeśli to czytasz to serwlet działa!";
    out.println("<HTML><BODY>");
    out.println("<H1>" + komunikat + "</H1>");
    out.println("</BODY></HTML>");
    out.close();
  }
	
}