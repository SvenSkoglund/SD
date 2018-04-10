package com.skilldistillery.el.data;

public class Stock {
  private String symbol;
  private String name;
  private double price;
  
  public Stock(String symbol, String name, double price) {
    this.symbol = symbol;
    this.name = name;
    this.price = price;
  }

  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Stock other = (Stock) obj;
	if (symbol == null) {
		if (other.symbol != null)
			return false;
	}
	else if (!symbol.equals(other.symbol))
		return false;
	return true;
}

public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Stock [symbol=" + symbol + ", name=" + name + ", price=" + price + "]";
  }
}
