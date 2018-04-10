package com.skilldistillery.javaweb.labs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InventoryServlet extends HttpServlet {
  private List<String> inventory;
  
  // initializer block
  {
    inventory = new ArrayList<>();
    inventory.add("Socks");
    inventory.add("Bananas");
    inventory.add("Cats");
  }
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter pw = resp.getWriter();
    pw.println("<html>");
    pw.println("<head><title>Inventory</title></head>");
    pw.println(" <body>");
    pw.println("<hr >");
    // Add a header to the output stream for Inventory.
    pw.println(" <h1>Inventory</h1>");
    pw.println("<ul>");
    for (String s : inventory) {
      pw.println("<li>");
      pw.println(s);
      pw.println("</li>");
    }
    pw.println("</ul>");
    // Add the products to inventory as an unordered list.
    
    pw.println("<hr>");
    pw.println("</body>");
    pw.println("</html>");
    pw.close();
  }
}
