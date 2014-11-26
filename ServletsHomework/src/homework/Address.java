package homework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Address extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String country = request.getParameter("country");
		String town = request.getParameter("town");
		String street = request.getParameter("street");

		HttpSession session = request.getSession();
		if (country != null && country.length() > 2 && town != null
				&& town.length() > 2 && street != null && street.length() > 2) {
			session.setAttribute("COUNTRY", country);
			session.setAttribute("TOWN", town);
			session.setAttribute("STREET", street);

			response.sendRedirect("University.html");
		} else {
			session.invalidate();
			response.sendRedirect("InvalidInfo.html");
		}
	}

}
