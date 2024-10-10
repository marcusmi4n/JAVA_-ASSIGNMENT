import java.util.ArrayList;
import java.util.Scanner;

public class NuMBER_1{
    public static void main(String[] args){
        //Creating the arraylist and naming the list.

        ArrayList <String> mian = new ArrayList<>();
        Scanner d = new Scanner(System.in);


        //Adding items in the arraylist.

        mian.add("Toyota");
        mian.add("Subaru");
        mian.add("Lamborghini");
        mian.add("Suzuki");
        mian.add("Volkswagen");

    
        //Displaying the arraylist
        int i;

         for (i = 0; i < 5; i++) {
            
            System.out.println("ELEMENT "+i+" : "+mian.get(i));

        }

        //Removing items in the Arraylist

        int r;

        System.out.println("ENTER ELEMENT TO REMOVE: ");
        r = d.nextInt();

        mian.remove(r);

        //Display list after Removal
        System.out.println("    LIST AFTER REMOVAL  ");
        
        for (i = 0; i < 4; i++) {
            
            System.out.println("ELEMENT "+i+" : "+mian.get(i));

        }
    }
}