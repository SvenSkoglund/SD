package drills;

public class Sphere {
  public double radius;

  public double getVolume() {
    double vol = 4.0 / 3.0 * 3.14159 * radius * radius * radius;
    return vol;
  }
}
