package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@--> anotaci�n!
@WebServlet("/ServletSaludo")
public class ServletSaludo extends HttpServlet {
	

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body><center>");
		
		for(int i=1;i<=6;i++) {
			out.println("<h"+i+">Bienvenido a mi servlet final, bueno, no era la final, vamos a la 4 a ver si es la final aaaajaaaa. Vale, pues ahora pa casa!</h"+i+">");
		}
		
		out.println("</center></body>");
		out.println("</html>");
		out.close();
	}
}
