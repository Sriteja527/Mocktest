import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers (enter 0 to calculate the average):");

        int number;
        int sum = 0;
        int count = 0;

        do {
            number = input.nextInt();

            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
