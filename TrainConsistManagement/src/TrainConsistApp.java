import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC5 ===");

        // 1. Initialize LinkedHashSet to store bogies
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies in order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 3. Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper");  // This will be ignored

        // 4. Display final formation preserving insertion order
        System.out.println("Train Formation in Insertion Order: " + trainFormation);

        System.out.println("UC5 operations completed successfully...");
    }
}
