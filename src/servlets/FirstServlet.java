package servlets;

import java.io.*; 
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
 
	private static final long serialVersionUID = 2738791077750342679L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String name = request.getParameter("userName");
			out.println("Welcome " + name);

			// appending the username in the query string
			out.print("<a href='servlet2?uname=" + name + "'>visit</a>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}