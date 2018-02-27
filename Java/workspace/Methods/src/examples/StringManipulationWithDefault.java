package examples;

public class StringManipulationWithDefault {

	public static void main(String[] args) {
		String defaultOutput = addCharacter("Default value added", 4);
		System.out.println(defaultOutput);
		
		String outputWithChar = addCharacter("Adding stars", 4, "*");
		System.out.println(outputWithChar);
	}
	
	public static String addCharacter(String input, int numExc) {
		System.out.println("\t addCharacter(String, int) called");
		System.out.println("\t -> delegating to addCharacter with \"!\" character");
		return addCharacter(input, numExc, "!"); //add "!" and let overloaded method do the logic
	}
	
	public static String addCharacter(String input, int numExc, String charToAdd) {
		System.out.println("\t addCharacter(String, int, String) called");
		String output = input;
		int counter = 0;
		while (counter < numExc) {
			output = output + charToAdd;
			counter = counter + 1;
		}
		return output;
	}

}
