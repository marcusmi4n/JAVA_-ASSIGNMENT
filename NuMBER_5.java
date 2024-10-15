public class NuMBER_5{
    public static <M> void printArray(M[] array) {
        for (M car : array) {
            System.out.print(car + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] NuMBERS = {1, 2, 3, 4, 5};
        System.out.println("NuMBERS :");
        printArray(NuMBERS);

        // String array
        String[] CARs = {"BMW", "Volkswagen", "Mercedes Benz"};
        System.out.println("CARs :");
        printArray(CARs);
    }
}