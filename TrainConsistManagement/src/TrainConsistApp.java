import java.util.*;
import java.util.stream.Collectors;

// Base Bogie class
abstract class Bogie {
    private String type;

    public Bogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}

// Passenger Bogie subclasses
class SleeperBogie extends Bogie {
    private int seatCapacity;

    public SleeperBogie(int seatCapacity) {
        super("Sleeper");
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return getType() + " [Seats: " + seatCapacity + "]";
    }
}

class ACChairBogie extends Bogie {
    private int seatCapacity;

    public ACChairBogie(int seatCapacity) {
        super("AC Chair");
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return getType() + " [Seats: " + seatCapacity + "]";
    }
}

class FirstClassBogie extends Bogie {
    private int seatCapacity;

    public FirstClassBogie(int seatCapacity) {
        super("First Class");
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return getType() + " [Seats: " + seatCapacity + "]";
    }
}

// Goods Bogie subclasses
class RectangularGoodsBogie extends Bogie {
    private String cargoType;

    public RectangularGoodsBogie(String cargoType) {
        super("Rectangular Goods");
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }

    @Override
    public String toString() {
        return getType() + " [Cargo: " + cargoType + "]";
    }
}

class CylindricalGoodsBogie extends Bogie {
    private String cargoType;

    public CylindricalGoodsBogie(String cargoType) {
        super("Cylindrical Goods");
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }

    @Override
    public String toString() {
        return getType() + " [Cargo: " + cargoType + "]";
    }
}

// Main App
public class TrainConsistApp {

    public static void main(String[] args) {
        // 1. Create a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new SleeperBogie(50));
        bogies.add(new ACChairBogie(60));
        bogies.add(new FirstClassBogie(30));
        bogies.add(new SleeperBogie(55));
        bogies.add(new RectangularGoodsBogie("Coal"));
        bogies.add(new CylindricalGoodsBogie("Oil"));
        bogies.add(new RectangularGoodsBogie("Grain"));

        // 2. Group bogies by type using Stream API and Collectors.groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // 3. Display the grouped result
        System.out.println("=== Grouped Bogies by Type ===");
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println(type + ":");
            bogieList.forEach(bogie -> System.out.println("  " + bogie));
        });

        // Original list remains unchanged
        System.out.println("\n=== Original Bogie List ===");
        bogies.forEach(System.out::println);
    }
}