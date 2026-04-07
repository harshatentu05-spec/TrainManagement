import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC3 ===");

        // 1. Initialize a HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // 2. Add bogie IDs (including duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // 3. Display the final set of unique bogie IDs
        System.out.println("Unique Bogie IDs in the Train Consist: " + bogieIDs);

        System.out.println("UC3 operations completed successfully...");
    }
}