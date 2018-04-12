package solutions;

public class ArrayAccess {

  public static void main(String[] args) {
    // Store the name of each weekday at the correct index.
    String[] weekdays = new String[7];
    weekdays[0] = "Sunday";
    weekdays[1] = "Monday";
    weekdays[2] = "Tuesday";
    weekdays[3] = "Wednesday";
    weekdays[4] = "Thursday";
    weekdays[5] = "Friday";
    weekdays[6] = "Saturday";
    
    // Store the grade A in the FIRST index of the array, 
    // and C in the LAST index of the array.
    char grades[] = new char[6];
    grades[0] = 'A';
    grades[5] = 'C';
    
    // Run the program and check the output to see if you were correct.
    System.out.println("Weekdays:");
    for(int i = 0; i < 7; i++) {
      System.out.println(i + ":" + weekdays[i]);
    }
    
    System.out.println("Grades:");
    for(int i = 0; i < 6; i++) {
      System.out.println(i + ":" + grades[i]);
    }
    
  }

}
