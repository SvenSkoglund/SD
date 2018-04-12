package solutions;

import drills.Sphere;

public class SphereReferences {

	public static void main(String[] args) {
		Sphere sphRef;
		sphRef = new Sphere();
		sphRef.radius = 10.0;
		System.out.println("Original sphRef radius: " + sphRef.radius);
		// Create another reference called otherSphereRef and assign sphRef to it,
		// so that both references refer to the same Sphere object.
		Sphere otherSphereRef = sphRef;
		
		// Change otherSphereRef's radius.
		otherSphereRef.radius = 99.0;
		
		// Output otherSphere's radius to the screen.
		System.out.println("otherSphereRef radius: " + otherSphereRef.radius);
		// Output sph's radius to the screen. It should have changed. 
		System.out.println("Final sphRef radius: " + sphRef.radius);
	}

}
