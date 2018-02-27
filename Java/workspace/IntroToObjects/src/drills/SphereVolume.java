package drills;

public class SphereVolume {
  public static void main(String[] args) {
    double radius = getRadius();

    double volume = calculateVolume(radius);

    printVolumeForRadius(radius, volume);
  }

  public static double getRadius() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    double radius = 0.0;
    System.out.print("Enter the radius of the sphere: ");
    radius = scanner.nextDouble();
    scanner.close();
    return radius;
  }

  public static double calculateVolume(double radius) {
    double vol = 4.0 / 3.0 * 3.14159 * radius * radius * radius;
    return vol;
  }

  public static void printVolumeForRadius(double radius, double volume) {
    System.out.print("A sphere of radius " + radius);
    System.out.println(" has a volume of " + volume);
  }
}
