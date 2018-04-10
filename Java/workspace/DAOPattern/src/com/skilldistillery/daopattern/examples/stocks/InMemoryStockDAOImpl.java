package com.skilldistillery.daopattern.examples.stocks;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStockDAOImpl implements StockDAO {

  private List<Stock> stocks;
  
  public InMemoryStockDAOImpl(){
    stocks = new ArrayList<>();
    
    stocks.add(new Stock("aapl", "Apple" ,107.25));
    stocks.add(new Stock("fb", "FaceBook", 105.50));
    stocks.add(new Stock("goog", "Alphabet", 750.50));
    stocks.add(new Stock("nflx", "Netflix", 117.00));
    stocks.add(new Stock("twtr", "Twitter", 22.57));
  }
  
  @Override
  public Stock findStockBySymbol(String symbol) {
    for (Stock stock : stocks) {
      if(stock.getSymbol().equals(symbol)) {
        return stock;
      }
    }
    return null;
  }

  @Override
  public List<Stock> getAllStocks() {
    return new ArrayList<>(stocks);
  }
}
