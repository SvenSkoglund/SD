package com.skilldistillery.hashmap.examples;

public class HashCodeDemo {

  public static void main(String[] args) {
    String[] stateAbbrs = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA",
        "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC",
        "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" };
    
    for (String abbr : stateAbbrs) {
      int code = abbr.hashCode();
      int mod16 = code % 16;
      System.out.println("\"" + abbr + "\": hashCode="+code+ ", mod16=" + mod16);
    }

  }

}
