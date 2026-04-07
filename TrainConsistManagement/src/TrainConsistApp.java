import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Define regex patterns
        String trainIdPattern = "TRN-\\d{4}";       // Format: TRN-1234
        String cargoCodePattern = "PET-[A-Z]{2}";    // Format: PET-AB

        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // 2. User input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainIdInput = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCodeInput = scanner.nextLine();

        // 3. Validate Train ID
        Matcher trainMatcher = trainPattern.matcher(trainIdInput);
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID format!");
        }

        // 4. Validate Cargo Code
        Matcher cargoMatcher = cargoPattern.matcher(cargoCodeInput);
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code format!");
        }

        scanner.close();
    }
}