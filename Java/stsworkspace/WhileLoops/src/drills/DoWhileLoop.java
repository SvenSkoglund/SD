package drills;

public class DoWhileLoop {

  public static void main(String[] args) {
    // Write a do-while loop to print the numbers 1 to 10 to the screen.
	  int i = 0;
	  do {
		  i++;
		  System.out.println(i);
	  }while (i<10);
    // Use Math.random() to write a do-while loop that will execute as long as a
    // random number is less than 0.7. Print the number inside the loop.
    // Declare a variable outside the loop, and assign a new Math.random() value in
    // the loop body. Then print the number to the screen.
    // Example: double d = Math.random();
	  
	  double random = 0;
	  do {
		  random = Math.random();
		  System.out.println(random);
	  }while(random < .7);
  }

}
