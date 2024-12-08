import java.util.Scanner;
public class TemperatureConverter {public static void main(String[] args){

        // The scanner allows user to enter an input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");

        // The statements below are to prompt the user to choose an option
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        int option = scanner.nextInt();

        // A conditional statements that validate the user's choice
        if (option != 1 && option != 2) {
            System.out.println("Invalid option. Please enter 1 or 2.");
            return;
        }
        // Below output will prompt the user to enter the temperature
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        //This statement also perform the operations based on the user's choice
        if (option == 1) {
            // Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            { // Fahrenheit to Celsius
                 double celsius = (temperature - 32) * 5/9;
                 System.out.println("Temperature in Celsius: " + celsius); }

            // Close the scanner
            scanner.close();
        }
    }
}