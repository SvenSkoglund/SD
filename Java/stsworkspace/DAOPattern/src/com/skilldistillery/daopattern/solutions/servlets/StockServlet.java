package com.skilldistillery.daopattern.solutions.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.daopattern.examples.stocks.JDBCStockDAOImpl;
import com.skilldistillery.daopattern.examples.stocks.Stock;
import com.skilldistillery.daopattern.examples.stocks.StockDAO;

public class StockServlet extends HttpServlet {
  private StockDAO stockDAO;

  @Override
  public void init() throws ServletException {
    // stockDAO = new InMemoryStockDAOImpl();
    // only one line changes
    try {
      stockDAO = new JDBCStockDAOImpl();
    }
    catch (ClassNotFoundException e) {
      throw new ServletException(e);
    }
  }

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String symbol = req.getParameter("symbol");
    Stock s = stockDAO.findStockBySymbol(symbol);

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

    pw.println("</body>");
    pw.println("</html>");
    pw.close();
  }

}
