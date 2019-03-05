package curs5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//get1
/**
 * Servlet implementation class Endpoint30
 */
@WebServlet("/Endpoint30")
public class Endpoint30 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Endpoint30() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("asta e pe get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nume = request.getParameter("Utilizator");
		String prenume = request.getParameter("Parola");
		request.getSession().setAttribute("Utilizator", nume);
		request.getSession().setAttribute("Parola", prenume);
		response.sendRedirect("/Curs-5/Login.jsp");
	}
	
}
