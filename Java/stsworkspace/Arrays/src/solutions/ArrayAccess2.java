package solutions;

public class ArrayAccess2 {

  public static void main(String[] args) {
    // Access all the B grades in the grades array and output them to the screen.
    char[] grades = {'C', 'F', 'B', 'A', 'C', 'B'};
    System.out.println(grades[2]);
    System.out.println(grades[5]);
    
    // Use values from the firstNames and lastNames arrays to create the names 
    // Sarah Dobbs and Davey Jones. 
    // Output the names to the screen.
    String firstNames[] = {"Matthew", "Mark", "Davey", "Sarah", "Linda" };
    String lastNames[] = {null, "Dobbs", "Cool", "Symbol", "Longshanks", "Jones"};
  
    String name1 = firstNames[3] + " " + lastNames[1];
    String name2 = firstNames[2] + " " + lastNames[5];
    
    System.out.println(name1);
    System.out.println(name2);
    
    // Declare and initialize an array containing your 
    // pet's name and the street you grew up on.
    // (If you do not have a pet, use the value null.) 
    String[] developerName = {"Fred", "Main"};
    
    // Reassign the same array and initialize it with your middle 
    // name and a U.S. President's last name. 
    // (Use the array shortcut. If you do not have a middle name, use the value null.)
    developerName = new String[] {"Francis", "Obama"};
    
   }

}
