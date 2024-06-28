import java.util.ArrayList;
import java.util.Arrays;

public class Lesson01 {
    public static void main(String[] args) {

        // Array
        String[] friendsArray = new String[3];
        friendsArray[0] = "Euler";
        friendsArray[1] = "Muenho";
        friendsArray[2] = "Sili";
        System.out.println(friendsArray[2]);

        // Or

        String[] friendsArray2 = {"Euler", "Muenho", "Sili"};
        System.out.println(friendsArray2[1]);

        // -------------------

        // ArrayList
        ArrayList<String> friendsArrayList = new ArrayList<>();
        // ArrayList do not have a fixed size, and you can change - Grows
        // and shrinks automatically!
        friendsArrayList.add("Euler");
        friendsArrayList.add("Muenho");
        friendsArrayList.add("Sili");
        System.out.println(friendsArrayList.get(1));

        // Or

        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList ("Euler", "Muenho", "Sili"));
        System.out.println(friendsArrayList2.get(2));

    }
}
