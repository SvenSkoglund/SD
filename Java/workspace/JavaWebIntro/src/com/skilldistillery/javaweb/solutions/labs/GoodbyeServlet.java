package com.skilldistillery.javaweb.solutions.labs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoodbyeServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter pw = resp.getWriter();
    pw.println("<html>");
    pw.println("<head><title>Goodbye</title></head>");
    pw.println(" <body>Goodbye World!</body>");
    pw.println("</html>");
    pw.close();
  }
}
