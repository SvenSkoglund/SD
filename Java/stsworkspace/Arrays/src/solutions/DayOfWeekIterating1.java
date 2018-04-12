package solutions;

public class DayOfWeekIterating1 {

  public static void main(String[] args) {
    // Iterate through the daysOfWeek array, but do not print 
    // Sunday or Saturday.
    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    for (int i = 0; i < daysOfWeek.length; i++) {
      String day = daysOfWeek[i];
      if(i != 0 && i != daysOfWeek.length - 1) {
        System.out.println(day);
      }
    }
  }

}
