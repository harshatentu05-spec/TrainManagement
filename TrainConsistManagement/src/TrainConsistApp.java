import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("==========================================\n");

        // 1. Create a HashMap to store bogie-capacity information
        // Key: Bogie Name (String), Value: Capacity (Integer)
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // 2. Insert capacity values using the put() method
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 120);
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);

        // 3. Iterate over the map using entrySet() to display details
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}
