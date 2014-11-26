package homework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NameAndAge
 */
public class NameAndAge extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		int age = Integer.parseInt(request.getParameter("age"));

		HttpSession session = request.getSession();
		if (firstName != null && firstName.length() > 2 && lastName != null
				&& lastName.length() > 2 && age > 12 && age < 120) {
			session.setAttribute("FIRSTNAME", firstName);
			session.setAttribute("LASTNAME", lastName);
			session.setAttribute("AGE", age);

			response.sendRedirect("Address.html");
		} else {
			session.invalidate();
			response.sendRedirect("InvalidInfo.html");
		}
	}

}
