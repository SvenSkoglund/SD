package com.skilldistillery.taglibraries.solutions.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.taglibraries.data.Stock;
import com.skilldistillery.taglibraries.data.StockProvider;

public class StockServletList extends HttpServlet {
  private StockProvider stockProvider;
  
  @Override
  public void init() throws ServletException {
    try {
      stockProvider = new StockProvider();
    }
    catch (ClassNotFoundException e) {
      throw new ServletException(e);
    }
  }

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    // Get all Stocks and add them to the request
    
    List<Stock> stocks = stockProvider.getAllStocks();
    
    req.setAttribute("stockList", stocks);
  
    req.getRequestDispatcher("/WEB-INF/solutions/listStocks.jsp").forward(req, resp);
    // Solution for formatting currency
    //req.getRequestDispatcher("/WEB-INF/solutions/listStocksFmt.jsp").forward(req, resp);
  }

}
