package drills;

public class ArrayAccess {

  public static void main(String[] args) {
    // Store the name of each weekday at the correct index.
    String[] weekdays = new String[7];
    
    // Store the grade A in the FIRST index of the array, 
    // and C in the LAST index of the array.
    char grades[] = new char[6];
    
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
