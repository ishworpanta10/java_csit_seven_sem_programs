import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String username = req.getParameter("username");
		String password =req.getParameter("password");
		System.out.println("Username :" + username + "Password :" + password);
		PrintWriter out = res.getWriter();
//		out.println("test");
//		out.println("Username :" + username + "Password :" + password);	
//		req.setAttribute(username, username);
		req.setAttribute("username", username);
		if(username.equals("asian") && password.equals("secret")) {
			RequestDispatcher rd = req.getRequestDispatcher("dashboard.jsp");
			rd.forward(req, res);
		}else {
		out.print("username or password incorrect");
		}
	}

}
