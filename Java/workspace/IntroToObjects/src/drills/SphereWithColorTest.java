package drills;

public class SphereWithColorTest {

  public static void main(String[] args) {
    // Create several SphereWithColor reference variables
    // and new objects.
	  SphereWithColor red12 = new SphereWithColor();
	  red12.radius = 12;
	  red12.color = "Red";
	  red12.displaySphere();
	  
	  SphereWithColor blue50 = new SphereWithColor();
	  blue50.radius = 50;
	  blue50.color = "Blue";
	  blue50.displaySphere();
    // Initialize each object's color and radius fields.
	  SphereWithColor purple4 = new SphereWithColor();
	  purple4.radius = 4;
	  purple4.color = "purple";
	  purple4.displaySphere();
    // Call displaySphere for each object.

    // Create another SphereWithColor, but do not initialize its fields.
    // Call its displaySphere method. What values do you see?\
	  
	  SphereWithColor emptySphere = new SphereWithColor();
	  emptySphere.displaySphere();
  }
  

}
