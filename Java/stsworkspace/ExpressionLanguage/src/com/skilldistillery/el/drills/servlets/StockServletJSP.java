package com.skilldistillery.el.drills.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.el.data.Stock;
import com.skilldistillery.el.data.StockProvider;

public class StockServletJSP extends HttpServlet {
	private StockProvider stockProvider;

	@Override
	public void init() throws ServletException {
		try {
			stockProvider = new StockProvider();
			searchedStocks = new ArrayList<Stock>();
		}
		catch (ClassNotFoundException e) {
			throw new ServletException(e);
		}
	}
	private List<Stock> searchedStocks;

	private Stock findStockBySymbol(List<Stock> stocks, String symbol) {
		Stock s = null;
		for (Stock stock : stocks) {
			if (stock.getSymbol().equals(symbol)) {
				s = stock;
				break;
			}
		}
		return s;
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String symbol = req.getParameter("symbol");
		List<Stock> listOfStocks = stockProvider.getAllStocks();
		Stock stock = findStockBySymbol(listOfStocks, req.getParameter("symbol").toUpperCase());
		if (stock == null) {
			req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
		}
		else {
			if(!searchedStocks.contains(stock)) {
			searchedStocks.add(stock);
			}
			req.setAttribute("symbol", symbol);
			req.setAttribute("history", searchedStocks);
			req.setAttribute("stock", stock);
			req.getRequestDispatcher("/WEB-INF/select.jsp").forward(req, resp);
		}

	}
}