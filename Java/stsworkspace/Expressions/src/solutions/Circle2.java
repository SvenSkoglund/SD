package solutions;

public class Circle2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double radius = 0.0;
        double circum = 0.0;
        double area   = 0.0;

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        circum = 2.0 * 3.14159265 * radius;
        area = 3.14159265 * radius * radius;

        System.out.print("A circle of radius " + radius);
        System.out.print(" has a circumference of " + circum);
        System.out.println(" and an area of " + area);

        scanner.close();
    }
}