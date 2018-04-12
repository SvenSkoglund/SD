package solutions;

public class DailyRainfall {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double sunday = 0.0, monday = 0.0, tuesday = 0.0;
        double wednesday = 0.0, thursday = 0.0, friday = 0.0, saturday = 0.0;
        double total = 0.0, average = 0.0;

        System.out.print("   Enter the rainfall level for Sunday: ");
        sunday = scanner.nextDouble();

        System.out.print("   Enter the rainfall level for Monday: ");
        monday = scanner.nextDouble();

        System.out.print("   Enter the rainfall level for Tuesday: ");
        tuesday = scanner.nextDouble();

        System.out.print("   Enter the rainfall level for Wednesday: ");
        wednesday = scanner.nextDouble();

        System.out.print("   Enter the rainfall level for Thursday: ");
        thursday = scanner.nextDouble();

        System.out.print("   Enter the rainfall level for Friday: ");
        friday = scanner.nextDouble();

        System.out.print("   Enter the rainfall level for Saturday: ");
        saturday = scanner.nextDouble();

        // Calculate the total rainfall and the average rainfall for the week
        total = sunday + monday + tuesday + wednesday + thursday
                + friday + saturday;
        average = total / 7;

        // Print the results of the processing
        System.out.println("   Total rainfall for the week: " + total);
        System.out.println(" Average rainfall for the week: "
                + average);
        
        scanner.close();
    }
}
