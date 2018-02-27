package drills;

public class SphereObjectProgram {

  public static void main(String[] args) {
    double rad = getRadius();

    // create a Sphere object
    Sphere s = new Sphere();
    s.radius = rad;

    // get the object's volume
    double volume = s.getVolume();

    // print the radius using this object's data
    printVolumeForRadius(s.radius, volume);

  }

  public static double getRadius() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    double radius = 0.0;
    System.out.print("Enter the radius of the sphere: ");
    radius = scanner.nextDouble();
    scanner.close();
    return radius;
  }

  public static void printVolumeForRadius(double radius, double volume) {
    System.out.print("A sphere of radius " + radius);
    System.out.println(" has a volume of " + volume);
  }
}
