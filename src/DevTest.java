import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test getNonZeroLenString
        String nonZeroLenString = SafeInput.getNonZeroLenString(scanner, "Enter a non-zero length string");
        System.out.println("Result: " + nonZeroLenString);

        // Test getInt
        int integer = SafeInput.getInt(scanner, "Enter an integer");
        System.out.println("Result: " + integer);

        // Test getDouble
        double decimal = SafeInput.getDouble(scanner, "Enter a decimal number");
        System.out.println("Result: " + decimal);

        // Test getRangedInt
        int rangedInt = SafeInput.getRangedInt(scanner, "Enter an integer in range [5, 10]", 5, 10);
        System.out.println("Result: " + rangedInt);

        // Test getRangedDouble
        double rangedDouble = SafeInput.getRangedDouble(scanner, "Enter a decimal in range [2.0, 7.5]", 2.0, 7.5);
        System.out.println("Result: " + rangedDouble);

        // Test getYNConfirm
        boolean ynConfirmation = SafeInput.getYNConfirm(scanner, "Enter Y or N for confirmation");
        System.out.println("Result: " + ynConfirmation);

        // Test getRegExString
        String regexInput = SafeInput.getRegExString(scanner, "Enter a string matching the pattern [A-Za-z]+", "[A-Za-z]+");
        System.out.println("Result: " + regexInput);

        // Test prettyHeader
        SafeInput.prettyHeader("Test Header");

        // Test CtoF
        double celsiusTemperature = 25.0;
        double fahrenheitTemperature = SafeInput.CtoF(celsiusTemperature);
        System.out.println("Celsius: " + celsiusTemperature + ", Fahrenheit: " + fahrenheitTemperature);

        scanner.close();
    }
}