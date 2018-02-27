package solutions;

public class DayOfWeekIterating2 {

  public static void main(String[] args) {
    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    System.out.println("Alternate solution...");
    for (int i = 0; i < daysOfWeek.length; i++) {
      String day = daysOfWeek[i];
      if(!"Saturday".equals(day) && !"Sunday".equals(day)) {
        System.out.println(day);
      }
    }
  }

}
