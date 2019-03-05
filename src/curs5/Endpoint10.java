package curs5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//get1
/**
 * Servlet implementation class Endpoint1
 */
@WebServlet("/Endpoint10")
public class Endpoint10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Endpoint10() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("asta e pe get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nume = request.getParameter("Nume");
		String prenume = request.getParameter("Prenume");
		String adresa = request.getParameter("Adresa");
		request.getSession().setAttribute("Nume", nume);
		request.getSession().setAttribute("Prenume", prenume);
		request.getSession().setAttribute("Adresa", adresa);
		response.sendRedirect("/Curs-5/HTML2.html");
	}
	
}
