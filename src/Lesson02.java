import java.util.ArrayList;
import java.util.Arrays;

public class Lesson02 {
    public static void main(String[] args) {

        // Array - Create
        String[] friendsArray = {"Euler", "Muenho", "Sili"};
        // Get element
        System.out.println(friendsArray[0]);
        // Get size
        System.out.println(friendsArray.length);
        // Add an Element
        // ---- You can't do that with Arrays
        // Set an element
        friendsArray[0] = "Relue";
        System.out.println(friendsArray[0]);
        // Remove an Element
        // ---- You can't do this with Arrays
        // ---- Can't remove elements, due to its fixed size.
        // Printing
        System.out.println(Arrays.toString(friendsArray));

        // ---------------------

        // ArrayList - Create
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Euler", "Muenho", "Sili"));
        // Get element
        System.out.println(friendsArrayList.get(0));
        // Get size
        System.out.println(friendsArrayList.size());
        // Add an element
        friendsArrayList.add("Prince");
        System.out.println(friendsArrayList.get(3));
        // Set an element
        friendsArrayList.set(0, "Relue");
        System.out.println(friendsArrayList.get(0));
        // Remove an element
        friendsArrayList.remove("Muenho");
        System.out.println(friendsArrayList.get(1));
        // Printing
        System.out.println(friendsArrayList);

    }
}
