
public class AssignSolution {

	public static void main(String[] args) {
		double battingAverage = .345;
		double thisYearBA = battingAverage;
		battingAverage = .362; //reassignment
		
		System.out.println(battingAverage);
		System.out.println(thisYearBA);
		
		// Run the code listed above, which reassigns battingAverage. Does this change thisYearBA?  

		// thisYearBA does not change because it was assigned a copy of the value 0.345 from battingAverage.
		// When battingAverage is reassigned, thisYearBA still has the value 0.345.
	}

}
