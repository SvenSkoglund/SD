package com.skilldistillery.taglibraries.solutions.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.taglibraries.data.Stock;
import com.skilldistillery.taglibraries.data.StockProvider;

public class StockServletSearch extends HttpServlet {
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
  
  private Stock findStockBySymbol(List<Stock> stocks, String symbol) {
    Stock s = null;
    for (Stock stock : stocks) {
      if(stock.getSymbol().equals(symbol)) {
        s = stock;
        break;
      }
    }
    return s;
  }

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String search = req.getParameter("search");
    if(search != null && !"".equals(search)) {
      req.setAttribute("searchString", search);
      List<Stock> stocks = stockProvider.getAllStocks();
      List<Stock> filtered = filterStocksForString(stocks, search);
      req.setAttribute("stocks", filtered);
      req.getRequestDispatcher("/WEB-INF/solutions/results.jsp").forward(req, resp);
    }
    else {
      String symbol = req.getParameter("symbol");
      List<Stock> stocks = stockProvider.getAllStocks();
      Stock s = findStockBySymbol(stocks, symbol);
      req.setAttribute("stock", s);
    
      req.getRequestDispatcher("/WEB-INF/solutions/selectFmt.jsp").forward(req, resp);
    }
  }

  private List<Stock> filterStocksForString(List<Stock> stocks, String search) {
    List<Stock> list = new ArrayList<>();
    for (Stock stock : stocks) {
      if(stock.getName().startsWith(search) || stock.getSymbol().startsWith(search)) {
        list.add(stock);
      }
    }
    
    return list;
  }

}
