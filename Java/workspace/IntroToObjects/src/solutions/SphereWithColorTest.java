package solutions;

public class SphereWithColorTest {

  public static void main(String[] args) {
    // Create several SphereWithColor reference variables
    // and new objects.
    SphereWithColor orange = new SphereWithColor();
    SphereWithColor sportsBall = new SphereWithColor();

    // Initialize each object's color and radius fields.
    orange.radius = 3.0;
    orange.color = "Orange";

    sportsBall.color = "White";
    sportsBall.radius = 4.5;

    // Call displaySphere for each object.
    orange.displaySphere();
    sportsBall.displaySphere();

    // Create another SphereWithColor, but do not initialize its fields.
    // Call its displaySphere method. What values do you see?
    SphereWithColor blackHole = new SphereWithColor();
    blackHole.displaySphere();
  }

}
