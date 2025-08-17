import java.util.Scanner;
public class SCT_SD_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose input scale:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double value = sc.nextDouble();

        if (choice == 1) { // Celsius
            System.out.println("Celsius: " + value);
            System.out.println("Fahrenheit: " + ((value * 9/5) + 32));
            System.out.println("Kelvin: " + (value + 273.15));
        }
        else if (choice == 2) { // Fahrenheit
            System.out.println("Fahrenheit: " + value);
            System.out.println("Celsius: " + ((value - 32) * 5/9));
            System.out.println("Kelvin: " + ((value - 32) * 5/9 + 273.15));
        }
        else if (choice == 3) { // Kelvin
            System.out.println("Kelvin: " + value);
            System.out.println("Celsius: " + (value - 273.15));
            System.out.println("Fahrenheit: " + ((value - 273.15) * 9/5 + 32));
        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
