package com.skilldistillery.jsp.drills.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.jsp.data.Stock;
import com.skilldistillery.jsp.data.StockProvider;

public class StockServlet extends HttpServlet {
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
    String symbol = req.getParameter("symbol");
    List<Stock> stocks = stockProvider.getAllStocks();
    Stock s = findStockBySymbol(stocks, symbol);

    PrintWriter pw = resp.getWriter();
    pw.println("<html>");
    pw.println("<head><title>Stocks</title></head>");
    pw.print("<body>");
    if (s != null) {
      pw.printf("<p>%s = %.2f</p>", symbol, s.getPrice());
      pw.println("<p><a href=\"select.html\">Back to Search</a></p>");
    }
    else {
      pw.println("<p>Invalid Symbol</p>");
      pw.println("<p><a href=\"select.html\">Try Again?</a></p>");
    }
    pw.println("<p><a href=\"index.html\">Back to Home</a></p>");

    pw.println("</body>");
    pw.println("</html>");
    pw.close();
  }

}
