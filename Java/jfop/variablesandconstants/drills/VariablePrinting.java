
public class VariablePrinting {

	public static void main(String[] args) {
		double battingAverage = .345;
		double thisYearBA = battingAverage;
		battingAverage = .362; //reassignment

		System.out.println("Batting average: " + battingAverage);
		System.out.println("This year's batting average: " + thisYearBA);

		// Add Strings to the System.out.println() statements to display which variable is being output

	}

}
