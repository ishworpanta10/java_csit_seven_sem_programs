package com.ishworpanta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		
		int result = (int) req.getAttribute("resultKey");
		
		int final_res = result*result;
		
		System.out.println("The square of result is : " +final_res );
		PrintWriter out = res.getWriter();
		out.println("This is from new Square Servlet Page using request dispatcher and getAttribute Method");
		out.println("The square of "+result+" is :"+final_res);
	}

}
