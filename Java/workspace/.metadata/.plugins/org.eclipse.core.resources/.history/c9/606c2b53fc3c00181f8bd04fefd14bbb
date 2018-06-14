package com.skilldistillery.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.data.president.PresidentDAO;

public class PresidentServlet extends HttpServlet {

  private PresidentDAO presidentDAO;
  
  @Override
  public void init() throws ServletException {
    super.init();
    presidentDAO = null;
  }
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
    // Add Data and choose view based on parameter input
    req.getRequestDispatcher("/WEB-INF/presidents.jsp").forward(req, resp);
    
  }
}
