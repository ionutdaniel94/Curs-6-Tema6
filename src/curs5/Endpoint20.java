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
@WebServlet("/Endpoint20")
public class Endpoint20 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Endpoint20() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("asta e pe get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String varsta = request.getParameter("Varsta");
		String telefon = request.getParameter("Telefon");
		
		request.getSession().setAttribute("Varsta", varsta);
		request.getSession().setAttribute("Telefon", telefon);
		response.sendRedirect("/Curs-5/NewFile.jsp");
	}
	
}
