import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Base class for Bogie (Reuse from previous UC)
class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " -> " + capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("=========================================");

        // 1. Create a list of bogies (Reuse UC7 logic)
        List<PassengerBogie> bogies = new ArrayList<>();
        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));
        bogies.add(new PassengerBogie("General", 90));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // 2. Define capacity threshold
        int capacityThreshold = 60;

        // 3. Use Stream API to filter (Declarative Style)
        List<PassengerBogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > capacityThreshold) // Lambda expression
                .collect(Collectors.toList());               // Collect into new list

        // 4. Display Results
        System.out.println("\nFiltered Bogies (Capacity > " + capacityThreshold + "):");
        if (filteredBogies.isEmpty()) {
            System.out.println("No matching bogies found.");
        } else {
            filteredBogies.forEach(System.out::println);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}
