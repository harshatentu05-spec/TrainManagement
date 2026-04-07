import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC2 ===");

        // 1. Initialize passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Display bogies after addition
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // 4. Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing AC Chair:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // 5. Check if 'Sleeper' exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Checking if 'Sleeper' exists: Contains Sleeper? " + hasSleeper);

        // 6. Print final state
        System.out.println("Final Train Passenger Consist: " + passengerBogies);

        System.out.println("UC2 operations completed successfully...");
    }
}