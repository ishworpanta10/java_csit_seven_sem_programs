package com.ishworpanta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		try {
			int firstNum = Integer.parseInt(req.getParameter("num1"));
			int secondNum = Integer.parseInt(req.getParameter("num2"));
			int result = firstNum + secondNum;
			req.setAttribute("resultKey", result);
			RequestDispatcher rd = req.getRequestDispatcher("square");
			rd.forward(req, res);

//			PrintWriter out = res.getWriter();

//			out.println("Addition of two number is :" + result);

			System.out.println("Addition of two number is :" + result);
		} catch (Exception e) {

			PrintWriter out = res.getWriter();
			out.println("Error In Number Format");
		}

	}

}
