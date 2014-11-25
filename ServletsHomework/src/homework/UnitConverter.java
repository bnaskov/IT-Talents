package homework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UnitConverter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		double num = Double.parseDouble(request.getParameter("unit1"));
		String unit1 = request.getParameter("unit1metrics");
		String unit2 = request.getParameter("unit2metrics");
		double result = 0;
		ServletOutputStream out = response.getOutputStream();

		switch (unit1) {
		case "centimeters":
			switch (unit2) {
			case "centimeters":
				result = num;
				break;
			case "meters":
				result = num / 100;
				break;
			case "kilometers":
				result = num / 100000;
				break;
			case "foots":
				result = num * 0.03280839;
				break;
			case "inches":
				result = num * 0.39370;
				break;
			case "yards":
				result = num * 0.0109361;
				break;
			case "miles":
				result = num * 0.00000621;
				break;
			default:
				break;
			}
			break;
		case "meters":
			switch (unit2) {
			case "centimeters":
				result = num * 100;
				break;
			case "meters":
				result = num;
				break;
			case "kilometers":
				result = num / 1000;
				break;
			case "foots":
				result = num * 3.2808398;
				break;
			case "inches":
				result = num * 39.3700787;
				break;
			case "yards":
				result = num * 1.09361;
				break;
			case "miles":
				result = num * 0.000621;
				break;
			default:
				break;
			}
			break;
		case "kilometers":
			switch (unit2) {
			case "centimeters":
				result = num * 100000;
				break;
			case "meters":
				result = num * 1000;
				break;
			case "kilometers":
				result = num;
				break;
			case "foots":
				result = num * 3280.8398;
				break;
			case "inches":
				result = num * 39370.0787;
				break;
			case "yards":
				result = num * 1093.61329;
				break;
			case "miles":
				result = num * 0.6213711;
				break;
			default:
				break;
			}
			break;
		case "foots":
			switch (unit2) {
			case "centimeters":
				result = num * 30.48;
				break;
			case "meters":
				result = num * 0.3048;
				break;
			case "kilometers":
				result = num * 0.0003048;
				break;
			case "foots":
				result = num;
				break;
			case "inches":
				result = num * 12;
				break;
			case "yards":
				result = num * 0.333333333;
				break;
			case "miles":
				result = num * 0.000189393;
				break;
			default:
				break;
			}
			break;
		case "inches":
			switch (unit2) {
			case "centimeters":
				result = num * 2.54;
				break;
			case "meters":
				result = num * 0.0254;
				break;
			case "kilometers":
				result = num * 0.0000254;
				break;
			case "foots":
				result = num * 0.083333333;
				break;
			case "inches":
				result = num;
				break;
			case "yards":
				result = num * 0.0277777777;
				break;
			case "miles":
				result = num * 0.000015782;
				break;
			default:
				break;
			}
			break;
		case "yards":
			switch (unit2) {
			case "centimeters":
				result = num * 91.44;
				break;
			case "meters":
				result = num * 0.9144;
				break;
			case "kilometers":
				result = num * 0.0009144;
				break;
			case "foots":
				result = num * 3;
				break;
			case "inches":
				result = num * 36;
				break;
			case "yards":
				result = num;
				break;
			case "miles":
				result = num * 0.000568181;
				break;
			default:
				break;
			}
			break;
		case "miles":
			switch (unit2) {
			case "centimeters":
				result = num * 160934.4;
				break;
			case "meters":
				result = num * 1609.344;
				break;
			case "kilometers":
				result = num * 1.609344;
				break;
			case "foots":
				result = num * 5280;
				break;
			case "inches":
				result = num * 63360;
				break;
			case "yards":
				result = num * 1760;
				break;
			case "miles":
				result = num;
				break;
			default:
				break;
			}
			break;

		default:
			break;
		}

		out.println("<h1>" + num + " " + unit1 + " = " + result + " " + unit2
				+ "</h1>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
