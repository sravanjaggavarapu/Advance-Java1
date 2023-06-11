package com.pack.operations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OperationServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OperationServelet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		int a = Integer.parseInt(request.getParameter("FirstNumber"));
		double b = Integer.parseInt(request.getParameter("SecondNumber"));
		String s = request.getParameter("op");

		double result = 0;
		/*
		 * if(s.equals("+")) result =a+b; else if(s.equals("-")) result=a-b; else
		 * if(s.equals("*")) result=a*b; else result=a/b;
		 */
		switch (s) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		}
       RequestDispatcher dispatcher= request.getRequestDispatcher("login.html");
       dispatcher.include(request, response);
		writer.println("Result of Two Numbers :  " + result);

	}

}
