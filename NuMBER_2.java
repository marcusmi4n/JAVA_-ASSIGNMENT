import java.util.ArrayList;

public class NuMBER_2{
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> cars = new ArrayList<>();

        // Add elements
        cars.add("Mazda");
        cars.add("Toyota");
        cars.add("Lamborghini");

        // Display elements
        System.out.println("Cars: " + cars);

        // Update element
        cars.set(1, "Mercedes Benz");

        // Display updated elements
        System.out.println("Updated Cars: " + cars);

        // Remove element
        cars.remove(0);

        // Display remaining elements
        System.out.println("Remaining Cars: " + cars);
    }
}