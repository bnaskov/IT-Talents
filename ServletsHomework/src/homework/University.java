package homework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class University extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String university = request.getParameter("university");
		String faculty = request.getParameter("faculty");
		String specialty = request.getParameter("specialty");

		HttpSession session = request.getSession();
		if (university != null && university.length() >= 2 && faculty != null
				&& faculty.length() >= 2 && specialty != null
				&& specialty.length() >= 2) {
			session.setAttribute("UNIVERSITY", university);
			session.setAttribute("FACULTY", faculty);
			session.setAttribute("SPECIALTY", specialty);

			response.sendRedirect("FullStudentInfo");
		} else {
			session.invalidate();
			response.sendRedirect("InvalidInfo.html");
		}
	}

}
