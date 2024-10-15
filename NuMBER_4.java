import java.util.HashMap;

public class NuMBER_3{
    public static void main(String[] args) {
        // Create HashMap
        HashMap<String, Integer> Car_Years = new HashMap<>();

        // Add key-value pairs
        Car_Years.put("Golf", 1982);
        Car_Years.put("Mercedes", 1966);
        Car_Years.put("Toyota", 1973);

        // Display key-value pairs
        System.out.println("Car Years: " + Car_Years);

        // Access value by key
        System.out.println("Car Years: " + Car_Years.get("Golf"));

        // Update value
        studentAges.put("Golf", 1964);

        // Display updated key-value pairs
        System.out.println("Updated Car Years: " + Car_Years);
    }
}