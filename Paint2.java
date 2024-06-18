import java.util.Scanner;

public class Paint2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for wall height and width
        System.out.println("Enter wall height (feet):");
        double wallHeight = scanner.nextDouble();
        System.out.println("Enter wall width (feet):");
        double wallWidth = scanner.nextDouble();

        // Assume one gallon of paint covers 350 square feet
        final double squareFeetPerGallon = 350.0;

        // Calculate the area of the wall
        double wallArea = wallHeight * wallWidth;

        // Calculate the amount of paint needed in gallons
        double gallonsPaintNeeded = wallArea / squareFeetPerGallon;

        // Use Math.ceil() to round up to the nearest whole number of cans needed
        int cansNeeded = (int) Math.ceil(gallonsPaintNeeded);

        // Output the results
        // Displaying gallons with default precision
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        // Ensuring cans needed displays with one decimal place
        System.out.println("Cans needed: " + cansNeeded + ".0 cans");

        scanner.close();
    }
}
