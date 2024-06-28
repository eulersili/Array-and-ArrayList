import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] namesArray = new String[5];
        namesArray[0] = "Elon Musk";
        namesArray[1] = "Mark Zuckerberg";
        namesArray[2] = "Satya Nadella";
        namesArray[3] = "Sundar Pichai";
        namesArray[4] = "Sam Altman";

        ArrayList<String> namesArrayList = new ArrayList<>(Arrays.asList(namesArray));
        System.out.println(namesArrayList.get(1));

    }
}
