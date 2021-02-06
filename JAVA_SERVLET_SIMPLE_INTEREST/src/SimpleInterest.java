import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/simple_interest")
public class SimpleInterest extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		float principle = Float.parseFloat(req.getParameter("principle"));
		float time = Float.parseFloat(req.getParameter("time"));
		float rate = Float.parseFloat(req.getParameter("rate"));

		
		float SI = ((principle * time * rate) / (float) 100);
		
		System.out.println("Simple Interest is : "+ SI );
		
		req.setAttribute("result_value", SI);
		
		RequestDispatcher rd =  req.getRequestDispatcher("result.jsp");
		rd.forward(req, res);

	}

}
