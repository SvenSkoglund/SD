package com.skilldistillery.webdata.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDataServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String firstName = req.getParameter("firstName");
    String lastName = req.getParameter("lastName");
    
    String[] days = req.getParameterValues("day");
    
    PrintWriter pw = resp.getWriter();
    pw.println("<html>");
    pw.println("<head><title>User Data</title></head>");
    pw.println(" <body>");
    pw.println(" <h3>You Entered:</h3>");
    
    pw.println("<ul>");
    pw.println("<li>" + firstName + "</li>");
    pw.println("<li>" + lastName + "</li>");
    
    if(days != null) {
      for(String s : days) {
        pw.println("<li>" + s + "</li>");
      }
    }
    
    pw.println("</ul>");
    pw.println("</body>");
    pw.println("</html>");
    pw.close();
  }
}
