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
@WebServlet("/Endpoint40")
public class Endpoint40 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Endpoint40() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("asta e pe get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parolaN = request.getParameter("Parola noua");
		String parolaV = request.getParameter("Parola veche");
		request.getSession().setAttribute("Parola noua", parolaN);
		request.getSession().setAttribute("Parola veche", parolaV);
		response.sendRedirect("/Curs-5/LostPassword.jsp");
	}
	
}
