package solutions;

public class ArrayReferences {

  public static void main(String[] args) {
    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    // Print the array
   /* for (int i = 0; i < daysOfWeek.length; i++) {
      System.out.print(daysOfWeek[i]);
      if(i != daysOfWeek.length - 1) { // don't do this for the last index
        System.out.print(", ");
      }
    }*/
    printArray(daysOfWeek);
    System.out.println();
    
    // * Call the changeArray method and pass the daysOfWeek array reference.
    changeArray(daysOfWeek);
   
    // Print the array again to see that its elements have changed, 
    // but it is the same array.
   /* for (int i = 0; i < daysOfWeek.length; i++) {
      System.out.print(daysOfWeek[i]);
      if(i != daysOfWeek.length - 1) { // don't do this for the last index
        System.out.print(", ");
      }
    }*/
    
    // * Refactor the printing of the array into a method and pass it the daysOfWeek array reference.
    printArray(daysOfWeek);
    
  
  }
  
  public static void changeArray(String[] inputArr) {
    // * Change Wednesday to "HUMPDAY" and Friday to "Viernes".
    // * (There is no need to iterate, just change the right index.)
    inputArr[3] = "HUMPDAY";
    inputArr[5] = "Viernes";
    
    // * Reassign inputArr to a new array containing the values
    // * "Su", "M", "T", "W", "Th", "F", "Sa"
    inputArr = new String[] {"Su", "M", "T", "W", "Th", "F", "Sa"};
  }

  public static void printArray(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if(i != arr.length - 1) { // don't do this for the last index
        System.out.print(", ");
      }
    }
  }
}
