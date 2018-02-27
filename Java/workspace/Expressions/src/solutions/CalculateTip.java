package solutions;

public class CalculateTip {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double amount = 0.0;
        double tip10 = 0.0;
        double tip15 = 0.0;
        double tip20 = 0.0;

        System.out
                .print("Please enter the amount of the check/bill: ");
        amount = scanner.nextDouble();

        tip10 = amount * 0.1;
        tip15 = amount * 0.15;
        tip20 = amount * 0.2;

        System.out.println("A 10% tip would be: " + tip10);
        System.out.println("A 15% tip would be: " + tip15);
        System.out.println("A 20% tip would be: " + tip20);

        scanner.close();
    }
}
