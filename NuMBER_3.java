import java.util.HashSet;

public class NuMBER_2{
    public static void main(String[] args) {
        // Create HashSet
        HashSet<String> cars = new HashSet<>();

        // Add elements
        cars.add("Mitsubishi");
        cars.add("Toyota");
        cars.add("Volkswagen");
        cars.add("Toyota"); // Duplicate element

        // Display elements
        System.out.println("Cars: " + cars);
    }
}
