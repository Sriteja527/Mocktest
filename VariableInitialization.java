import java.util.Scanner;

public class VariableInitialization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare and initialize variables
        int num1;
        double num2;
        String text;

        // Take input from the user
        System.out.println("Enter an integer number: ");
        num1 = input.nextInt();

        System.out.println("Enter a double number: ");
        num2 = input.nextDouble();
        input.nextLine(); // Consume the newline character

        System.out.println("Enter a string: ");
        text = input.nextLine();

        // Display the values of variables
        System.out.println("The integer number is: " + num1);
        System.out.println("The double number is: " + num2);
        System.out.println("The string is: " + text);
    }
}
