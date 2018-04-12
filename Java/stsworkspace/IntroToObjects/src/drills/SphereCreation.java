package drills;

public class SphereCreation {

  public static void main(String[] args) {
	  
	  Sphere baseball = new Sphere();
	  baseball.radius = 3.7;
	  
	  Sphere basketball = new Sphere();
	  basketball.radius = 12;
	  
	  Sphere mercury = new Sphere();
	  mercury.radius = 244_000_000.0;
	  
    // Create three Sphere "objects."
    // 1. A baseball, radius 3.7
    // 2. A basketball, radius 12.0
    // 3. Mercury, radius 244 million centimeters
    //    Try writing this as 244_000_000.0 or 244e5
	  
	  System.out.println("Baseball volume: " + baseball.getVolume());
	  System.out.println("Basketball volume: " + basketball.getVolume());
	  System.out.println("Mercury volume: " + mercury.getVolume());

    // Print each object's volume to the screen using System.out.println.

  }

}
