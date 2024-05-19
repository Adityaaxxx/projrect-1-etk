import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Meter to Centimeter");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Seconds to Minutes");
        System.out.println("4. Minutes to Hours");
        System.out.println("5. Centimeter to Meter");
        System.out.println("6. Fahrenheit to Celsius");
        System.out.println("7. Minutes to Seconds");
        System.out.println("8. Hours to Minutes");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter length in meters:");
                double meters = scanner.nextDouble();
                double centimeters = meters * 100;
                System.out.println(meters + " meters is equal to " + centimeters + " centimeters.");
                break;
            case 2:
                System.out.println("Enter temperature in Celsius:");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
                break;
            case 3:
                System.out.println("Enter time in seconds:");
                int seconds = scanner.nextInt();
                double minutes = seconds / 60.0;
                System.out.println(seconds + " seconds is equal to " + minutes + " minutes.");
                break;
            case 4:
                System.out.println("Enter time in minutes:");
                double minutesInput = scanner.nextDouble();
                double hours = minutesInput / 60;
                System.out.println(minutesInput + " minutes is equal to " + hours + " hours.");
                break;
            case 5:
                System.out.println("Enter length in centimeters:");
                double centimetersInput = scanner.nextDouble();
                double metersOutput = centimetersInput / 100;
                System.out.println(centimetersInput + " centimeters is equal to " + metersOutput + " meters.");
                break;
            case 6:
                System.out.println("Enter temperature in Fahrenheit:");
                double fahrenheitInput = scanner.nextDouble();
                double celsiusOutput = (fahrenheitInput - 32) * 5 / 9;
                System.out.println(fahrenheitInput + " degrees Fahrenheit is equal to " + celsiusOutput + " degrees Celsius.");
                break;
            case 7:
                System.out.println("Enter time in minutes:");
                int minutesInputSeconds = scanner.nextInt();
                int secondsOutput = minutesInputSeconds * 60;
                System.out.println(minutesInputSeconds + " minutes is equal to " + secondsOutput + " seconds.");
                break;
            case 8:
                System.out.println("Enter time in hours:");
                double hoursInputMinutes = scanner.nextDouble();
                double minutesOutput = hoursInputMinutes * 60;
                System.out.println(hoursInputMinutes + " hours is equal to " + minutesOutput + " minutes.");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
Converter
