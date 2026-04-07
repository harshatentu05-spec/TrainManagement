import java.util.*;
import java.util.stream.Collectors;

// Assuming Bogie classes from UC9 are reused

public class TrainConsistApp {

    public static void main(String[] args) {
        // 1. Create a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new SleeperBogie(50));
        bogies.add(new ACChairBogie(60));
        bogies.add(new FirstClassBogie(30));
        bogies.add(new SleeperBogie(55));
        bogies.add(new RectangularGoodsBogie("Coal"));  // Goods bogie, ignored
        bogies.add(new CylindricalGoodsBogie("Oil"));    // Goods bogie, ignored

        // 2. Calculate total seating capacity using map + reduce
        int totalSeats = bogies.stream()
                // Only consider passenger bogies
                .filter(b -> b instanceof SleeperBogie || b instanceof ACChairBogie || b instanceof FirstClassBogie)
                // Extract seat capacity
                .map(b -> {
                    if (b instanceof SleeperBogie) return ((SleeperBogie) b).getSeatCapacity();
                    if (b instanceof ACChairBogie) return ((ACChairBogie) b).getSeatCapacity();
                    if (b instanceof FirstClassBogie) return ((FirstClassBogie) b).getSeatCapacity();
                    return 0;
                })
                // Aggregate capacities
                .reduce(0, Integer::sum);

        // 3. Display total seats
        System.out.println("=== Total Seating Capacity in Train ===");
        System.out.println("Total Seats: " + totalSeats);

        // Original list remains unchanged
        System.out.println("\n=== Original Bogie List ===");
        bogies.forEach(System.out::println);
    }
}