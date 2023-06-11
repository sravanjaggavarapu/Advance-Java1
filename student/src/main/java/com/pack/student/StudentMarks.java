package com.pack.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		String StudentName = request.getParameter("StudentName");
		int StudentNumber =Integer.parseInt(request.getParameter("StudentNumber")) ;
		int SocialMarks = Integer.parseInt(request.getParameter("SocialMarks")) ;	
		int EnglishMarks = Integer.parseInt(request.getParameter("EnglishMarks")) ;
		int MathsMarks = Integer.parseInt(request.getParameter("MathsMarks")) ;
		//String enter=request.getParameter("Enter");
		//System.out.println("sravan");
		int totalMarks=SocialMarks+EnglishMarks+MathsMarks;
		int average = totalMarks/3;
		char grade;
		if(average>=70)
			grade='A';
		else if(average>=50 && average<70)
			grade='B';
		else
			grade='C';
		
		
		writer.println("<html><body bgcolor='gold' style='text-align: center;'/>");
		writer.println("<h1 style='color : blue'>Student Details</h1>");
		writer.println("<p style='color : red; '>\nStudent Name : "+StudentName+"</p>");
		writer.println("<p style='color : red; '>\nStudentNumber :  "+StudentNumber+"</p>");
		writer.println("<p style='color : red; '>\nSocialMarks : "+SocialMarks+"</p>");
		writer.println("<p style='color : red; '>\nEnglish Marks : "+EnglishMarks+"</p>");
		writer.println("<p style='color : red; '>\nMaths Marks  : "+MathsMarks+"</p>");
		writer.println("<p style='color : red; '>\nTotal Marks  : "+totalMarks+"</p>");
		writer.println("<p style='color : red; '>\nAverage  : "+average+"</p>");
		writer.println("<p style='color : red; '> Grade : "+grade);
		writer.println("</html></body>");
	}
	}


