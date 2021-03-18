import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/simple_interest")
public class SimpleInterest extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		double principle = Double.parseDouble(req.getParameter("principle"));
		double time = Double.parseDouble(req.getParameter("time"));
		double rate = Double.parseDouble(req.getParameter("rate"));

		double SI = ((principle * time * rate) / 100);

		System.out.println("Simple Interest is : " + SI);

		req.setAttribute("result_value", SI);

		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.forward(req, res);

	}

}
