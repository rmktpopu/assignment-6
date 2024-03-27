import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        double largest = Double.MIN_VALUE;
        double smallest = Double.MAX_VALUE;

        System.out.println("Enter numbers (type 'done' to finish):");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                count++;
                sum += number;

            
                largest = Math.max(largest, number);
                smallest = Math.min(smallest, number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No valid numbers entered.");
        }

        scanner.close();
    }
}
