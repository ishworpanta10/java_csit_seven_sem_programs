import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String username = String.valueOf(req.getParameter("username"));
		String password = String.valueOf(req.getParameter("password"));
		System.out.println("Username :" + username + "Password :" + password);
		PrintWriter out = res.getWriter();
//		out.println("test");
//		out.println("Username :" + username + "Password :" + password);	
//		req.setAttribute(username, username);
		if(username.equals("asian") && password.equals("s3cret")) {
			RequestDispatcher rd = req.getRequestDispatcher("dashboard.jsp");
			rd.forward(req, res);
		}else {
		out.print("username or password incorrect");
		}
	}

}
