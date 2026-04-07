import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {
        // 1. Welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize empty train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // 4. Program can continue for further use cases
        System.out.println("Train consist is ready for adding bogies.");
    }
}