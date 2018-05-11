package com.skilldistillery.webdatalabs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDataServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("<html><head><title>User Data</title></head><body>");
		pw.println("<h1>You entered:</h1>");
		pw.println(req.getAttribute("firstName"));
		pw.println(req.getAttribute("lastName"));
		pw.println(req.getAttribute("days"));
		pw.println("</body></html>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		Integer age = 0;
		try {
			age = Integer.parseInt(req.getParameter("age"));
		}
		catch (NumberFormatException e) {
			age = 0;
		}
		String[] days = req.getParameterValues("days");
		pw.println("<html><head><title>User Data</title></head><body>");
		pw.println("<h1>You entered:</h1>");
		pw.println(firstName);
		pw.println(lastName + "<br>");
		pw.println(age +"<br>");
		if (age > 21) {
			pw.println("<p> You are over 21 </p>");
		}
		// pw.println("<script>alert(\"Malice!\");</script>");

		if (days != null) {
			pw.println("<ul>");
			for (String day : days) {
				pw.println("<li>" + day + "</li>");
			}
			pw.println("</ul>");
		}else {
			pw.println("<p>No Days Selected </p>");
		}
		pw.println("</body></html>");
	}

}