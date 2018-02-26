
public class ThreeVariables {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		String deptNum = "";
		double salary = 0.0;
		int employeeId = 0;

		System.out.print(" Please enter the department code: ");
		deptNum = scanner.next();

		System.out.print("           Please enter the salary : ");
		salary = scanner.nextDouble();

		System.out.print("        Please enter the employee id : ");
		employeeId = scanner.nextInt();

		System.out.println("a: " + "Department Number: " + deptNum + " " + "Salary: " + salary + " " + "Employee Id: "
				+ employeeId);

		System.out.println("b: " + "Department Number: " + deptNum + "\t" + "Salary: " + salary + "\t" + "Employee Id: "
				+ employeeId);

		System.out.println("c:\n" + "Department Number: " + deptNum + "\n" + "Salary: " + salary + "\n"
				+ "Employee Id: " + employeeId);

		scanner.close();
	}
}
