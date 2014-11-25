package loginForm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("USER");
		if (userName != null) {
			response.setContentType("text/html");
			ServletOutputStream out = response.getOutputStream();
			out.println("<html><body><h1>");
			out.println("Hello, " + userName + "! ");
			out.println("</h1></body></html>");
		} else {
			response.sendRedirect("LoginForm.html");
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
