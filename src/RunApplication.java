import java.util.Scanner;

// I run the application by asking the user for console sales details.
public class RunApplication {
    // I show these console types as the user's choices.
    private static final String[] CONSOLE_TYPES = {"PS5", "Xbox", "1Switch"};

    // I collect the details, create a sales record, and print its report.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select a console device:");
            for (int i = 0; i < CONSOLE_TYPES.length; i++) {
                System.out.printf("%d. %s%n", i + 1, CONSOLE_TYPES[i]);
            }

            int selection = readInteger(scanner, "Select the console type: ", 1, CONSOLE_TYPES.length);
            String storeName = readNonBlank(scanner, "Enter the store : ");
            int totalSales = readInteger(scanner, "Enter the total sales amount: ", 0, Integer.MAX_VALUE);

            ConsoleSales sales = new ConsoleSales(CONSOLE_TYPES[selection - 1], storeName, totalSales);
            sales.printReport();
        }
    }

    // I keep asking until the user enters a non-empty value.
    private static String readNonBlank(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Please enter a value.");
        }
    }

    // I keep asking until the user enters a whole number in the allowed range.
    private static int readInteger(Scanner scanner, String prompt, int minimum, int maximum) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value >= minimum && value <= maximum) {
                    return value;
                }
            } catch (NumberFormatException ignored) {
                // I handle invalid text by showing the number prompt again.
            }
            System.out.printf("Enter a whole number from %d to %d.%n", minimum, maximum);
        }
    }
}
