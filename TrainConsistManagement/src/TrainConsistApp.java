import java.util.LinkedList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC4 ===");

        // 1. Initialize a LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);


        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + trainConsist);

        // 4. Remove first and last bogie
        trainConsist.removeFirst();  // removes Engine
        trainConsist.removeLast();   // removes Guard
        System.out.println("After removing first and last bogie: " + trainConsist);

        // 5. Display final ordered train consist
        System.out.println("Final Ordered Train Consist: " + trainConsist);

        System.out.println("UC4 operations completed successfully...");
    }
}