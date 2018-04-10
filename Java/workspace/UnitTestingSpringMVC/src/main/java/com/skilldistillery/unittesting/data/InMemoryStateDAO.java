package com.skilldistillery.unittesting.data;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStateDAO implements StateDAO {

  private List<State> states;

  public InMemoryStateDAO() {
    states = new ArrayList<>();
    states.add(new State("AL", "Alabama", "Montgomery", "32.38012", "-86.300629", 205764));
    states.add(new State("AK", "Alaska", "Juneau", "58.29974", "-134.406794", 31275));
    states.add(new State("AZ", "Arizona", "Phoenix", "33.44826", "-112.075774", 1445632));
    states.add(new State("AR", "Arkansas", "Little Rock", "34.748655", "-92.274494", 193524));
    states.add(new State("CA", "California", "Sacramento", "38.579065", "-121.491014", 466488));
    states.add(new State("CO", "Colorado", "Denver", "39.74001", "-104.992259", 600158));
    states.add(new State("CT", "Connecticut", "Hartford", "41.763325", "-72.674069", 124775));
    states.add(new State("DE", "Delaware", "Dover", "39.158035", "-75.524734", 36047));
    states.add(new State("FL", "Florida", "Tallahassee", "30.439775", "-84.280649", 181376));
    states.add(new State("GA", "Georgia", "Atlanta", "33.748315", "-84.391109", 420003));
    states.add(new State("HI", "Hawaii", "Honolulu", "21.30477", "-157.857614", 337256));
    states.add(new State("ID", "Idaho", "Boise", "43.60698", "-116.193409", 205671));
    states.add(new State("IL", "Illinois", "Springfield", "39.801055", "-89.643604", 116250));
    states.add(new State("IN", "Indiana", "Indianapolis", "39.76691", "-86.149964", 820445));
    states.add(new State("IA", "Iowa", "Des Moines", "41.58979", "-93.615659", 203433));
    states.add(new State("KS", "Kansas", "Topeka", "39.049285", "-95.671184", 127473));
    states.add(new State("KY", "Kentucky", "Frankfort", "38.19507", "-84.878694", 25527));
    states.add(new State("LA", "Louisiana", "Baton Rouge", "30.443345", "-91.186994", 229493));
    states.add(new State("ME", "Maine", "Augusta", "44.318036", "-69.776218", 19136));
    states.add(new State("MD", "Maryland", "Annapolis", "38.9767", "-76.489934", 38394));
    states.add(new State("MA", "Massachusetts", "Boston", "42.358635", "-71.056699", 617594));
    states.add(new State("MI", "Michigan", "Lansing", "42.73194", "-84.552249", 114297));
    states.add(new State("MN", "Minnesota", "Saint Paul", "44.943829", "-93.093326", 285068));
    states.add(new State("MS", "Mississippi", "Jackson", "32.29869", "-90.180489", 173514));
    states.add(new State("MO", "Missouri", "Jefferson City", "38.577515", "-92.177839", 43079));
    states.add(new State("MT", "Montana", "Helana", "46.58976", "-112.021202", 28190));
    states.add(new State("NE", "Nebraska", "Lincoln", "40.81362", "-96.707739", 258379));
    states.add(new State("NV", "Nevada", "Carson City", "39.164885", "-119.766999", 55274));
    states.add(new State("NH", "New Hampshire", "Concord", "43.20725", "-71.536604", 42695));
    states.add(new State("NJ", "New Jersey", "Trenton", "40.217875", "-74.759404", 84913));
    states.add(new State("NM", "New Mexico", "Santa Fe", "35.691543", "-105.937406", 67947));
    states.add(new State("NY", "New York", "Albany", "42.651445", "-73.755254", 97856));
    states.add(new State("NC", "North Carolina", "Raleigh", "35.78551", "-78.642669", 403892));
    states.add(new State("ND", "North Dakota", "Bismarck", "46.805372", "-100.779334", 61272));
    states.add(new State("OH", "Ohio", "Columbus", "39.96196", "-83.002984", 787033));
    states.add(new State("OK", "Oklahoma", "Oklahoma City", "35.472015", "-97.520354", 579999));
    states.add(new State("OR", "Oregon", "Salem", "44.93326", "-123.043814", 154637));
    states.add(new State("PA", "Pennsylvania", "Harrisburg", "40.259865", "-76.88223", 49528));
    states.add(new State("RI", "Rhode Island", "Providence", "41.823875", "-71.411994", 178042));
    states.add(new State("SC", "South Carolina", "Columbia", "33.99855", "-81.045249", 129272));
    states.add(new State("SD", "South Dakota", "Pierre", "44.368924", "-100.350158", 13646));
    states.add(new State("TN", "Tennessee", "Nashville", "36.167783", "-86.778365", 601222));
    states.add(new State("TX", "Texas", "Austin", "30.267605", "-97.742984", 790390));
    states.add(new State("UT", "Utah", "Salt Lake City", "40.759505", "-111.888229", 186440));
    states.add(new State("VT", "Vermont", "Montpelier", "44.260299", "-72.576264", 7855));
    states.add(new State("VA", "Virginia", "Richmond", "37.5407", "-77.433654", 204214));
    states.add(new State("WA", "Washington", "Olympia", "47.039231", "-122.891366", 46478));
    states.add(new State("WV", "West Virginia", "Charleston", "38.350195", "-81.638989", 51400));
    states.add(new State("WI", "Wisconsin", "Madison", "43.07295", "-89.386694", 233209));
    states.add(new State("WY", "Wyoming", "Cheyenne", "41.134815", "-104.821544", 59466));
  }

  @Override
  public State getStateByName(String name) {
    State s = null;
    for (State st : states) {
      if (st.getName().equals(name)) {
        s = st;
        break;
      }
    }
    return s;
  }

  @Override
  public State getStateByAbbreviation(String abbreviation) {
    State s = null;
    for (State st : states) {
      if (st.getAbbreviation().equals(abbreviation)) {
        s = st;
        break;
      }
    }
    return s;
  }

  @Override
  public void addState(State state) {
    states.add(state);
  }

}
