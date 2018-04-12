package com.skilldistillery.javaweb.labs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoodbyeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String name = req.getParameter("name");
	    String outputText = "Goodbye " + name;
	    PrintWriter pw = resp.getWriter();
	    // HTML text added to response
	    pw.println("<html>");
	    pw.println("<head><title>Goodbye World</title></head>");
	    pw.println(" <body>" + outputText + "</body>");
	    pw.println("</html>");
	    pw.close();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	
}
