package carboncalculator.test;

import java.util.Scanner;

public class CarbonCalculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for inputs
        System.out.println("Enter the number of lines of code: ");
        int linesOfCode = scanner.nextInt();
        
        System.out.println("Enter the average CPU utilization: ");
        double cpuUtilization = scanner.nextDouble();
        
        System.out.println("Enter the average memory utilization: ");
        double memoryUtilization = scanner.nextDouble();
        
        System.out.println("Enter the average network utilization: ");
        double networkUtilization = scanner.nextDouble();
        
        // Calculate carbon footprint
        double carbonFootprint = linesOfCode * 0.001 + cpuUtilization * 0.1 + memoryUtilization * 0.01 + networkUtilization * 0.001;
        
        // Provide actionable insights
        if (carbonFootprint > 0.5) {
            System.out.println("Your software has a high carbon footprint. Consider optimizing your code and reducing network and CPU utilization.");
        } else if (carbonFootprint > 0.2) {
            System.out.println("Your software has a moderate carbon footprint. Consider optimizing your code and reducing network and CPU utilization.");
        } else {
            System.out.println("Your software has a low carbon footprint. Keep up the good work!");
        }
    }

}
