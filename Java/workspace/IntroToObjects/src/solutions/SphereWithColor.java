package solutions;

public class SphereWithColor {
  public double radius;
  // Add a String field for color.
  public String color;

  public double getVolume() {
    double vol = 4.0 / 3.0 * 3.14159 * radius * radius * radius;
    return vol;
  }

  // Add a method called displaySphere.
  // return type: void
  // parameters: none
  // functionality: Prints the object's radius, color, and volume to the screen.
  public void displaySphere() {
    System.out.println("radius: " + radius + ", color: " + color
        + ", volume: " + getVolume());
  }
}
