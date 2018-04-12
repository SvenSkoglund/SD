package solutions;

public class Iterating {

  public static void main(String[] args) {
    // Iterate through the names array to print the index of the name, 
    // and the name, e.g. 0 : Mike.
    String[] names = {"Mike", "Davey", "Peter", "Mickey"};
    for (int i = 0; i < names.length; i++) {
      System.out.println(i + " : " + names[i]);
    }
    // Iterate through the precip array, but only print 
    // values greater than 2.5.
    double[] precip = new double[] {3.2, 0.5, 1.7, 2.8, 2.0, 3.1, 0.0, 0.2, 9.0};
    for (int i = 0; i < precip.length; i++) {
      if(precip[i] > 2.5) {
        System.out.println(precip[i]);
      }
    }
    
    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    // Iterate through the daysOfWeek array, but do not print 
    // Sunday or Saturday.
    // See DayOfWeekIterating1 and DayOfWeekIterating2
    
    // After iterating, print the daysOfWeek array itself: System.out.println(daysOfWeek). 
    // Note the format, and what doesn't get printed.
    System.out.println(daysOfWeek);
  }

}
