package com.skilldistillery.daopattern.examples.stocks;

import java.util.List;

public interface StockDAO {
	public Stock findStockBySymbol(String symbol);
	public List<Stock> getAllStocks();
}
