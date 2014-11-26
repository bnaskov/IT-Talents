package homework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FullStudentInfo
 */
public class FullStudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String firstName = (String) session.getAttribute("FIRSTNAME");
		String lastName = (String) session.getAttribute("LASTNAME");
		int age = (int) session.getAttribute("AGE");
		String country = (String) session.getAttribute("COUNTRY");
		String town = (String) session.getAttribute("TOWN");
		String street = (String) session.getAttribute("STREET");
		String university = (String) session.getAttribute("UNIVERSITY");
		String faculty = (String) session.getAttribute("FACULTY");
		String specialty = (String) session.getAttribute("SPECIALTY");

		response.setContentType("text/html");
		ServletOutputStream out = response.getOutputStream();
		out.println("<html><body><h3>");
		out.println(String
				.format("Full name: %s %s, age: %d; Address: Country: %s, Town: %s, Street: %s; University: %s, Faculty: %s, Specialty: %s.",
						firstName, lastName, age, country, town, street,
						university, faculty, specialty));
		out.println("</h3></body></html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
