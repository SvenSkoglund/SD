package solutions;

import drills.Sphere; //Sphere exists in drills, so we have to import it

public class SphereCreation {

	public static void main(String[] args) {
		// Create three Sphere "objects."
		// 1. A baseball, radius 3.7 
		// 2. A basketball, radius 12.0
		// 3. Mercury, radius 244 million centimeters
		
		Sphere baseball = new Sphere();
		baseball.radius = 3.7;
		
		Sphere basketball = new Sphere();
		basketball.radius = 12.0; 
		
		Sphere mercury = new Sphere();
		mercury.radius = 2440e5;
		//mercury.radius = 244_000_000.0;
		
		// Print each object's volume to the screen using System.out.println.
		double volume = baseball.getVolume();
		System.out.println("Volume: " + volume);
		
		volume = basketball.getVolume();
		System.out.println("Volume: " + volume);
		
		volume = mercury.getVolume();
		System.out.println("Volume: " + volume);	
	}
	

}
