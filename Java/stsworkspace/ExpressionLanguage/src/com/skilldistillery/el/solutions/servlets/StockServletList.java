package com.skilldistillery.el.solutions.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.el.data.Stock;
import com.skilldistillery.el.data.StockProvider;

public class StockServletList extends HttpServlet {
  private StockProvider stockProvider;

  private List<Stock> foundStocks;
  
  @Override
  public void init() throws ServletException {
    try {
      stockProvider = new StockProvider();
    }
    catch (ClassNotFoundException e) {
      throw new ServletException(e);
    }
    foundStocks = new ArrayList<>();
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
    String symbol = req.getParameter("symbol");
    List<Stock> stocks = stockProvider.getAllStocks();
    Stock s = findStockBySymbol(stocks, symbol);
    // Add the stock to the list of all stocks
    if(s != null) {
      foundStocks.add(s);
    }
    
    req.setAttribute("stock", s);
    // Add the list to the model.
    req.setAttribute("list", foundStocks);
    req.getRequestDispatcher("/WEB-INF/solutions/selectList.jsp").forward(req, resp);
  }

}
