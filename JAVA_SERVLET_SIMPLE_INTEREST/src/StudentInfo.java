import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/student_form")
public class StudentInfo extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String email = req.getParameter("email");
		String father = req.getParameter("fname");
		String age = req.getParameter("age");
		
		req.setAttribute("name", name);
		req.setAttribute("address", address);
		req.setAttribute("father", father);
		req.setAttribute("email", email);
		req.setAttribute("age", age);
		
		RequestDispatcher rd = req.getRequestDispatcher("student_info.jsp");
		rd.forward(req, res);
	}

}
