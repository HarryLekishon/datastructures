import java.util.ArrayList;
import java.util.Arrays;

public class ArraysVsArrayList {
    public static void main(String[] args) {

        String[] friendsArray2 = {"Joe", "Prince", "Mike"};

        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Peter", "Paul"));

        System.out.println(friendsArray2[1]);
        System.out.println(friendsArrayList2.get(1));

        System.out.println(friendsArray2.length);
        System.out.println(friendsArrayList2.size());

        friendsArrayList2.add("Mitch");
        System.out.println(friendsArrayList2.get(3));

        System.out.println(friendsArrayList2.size());

        friendsArray2[0] = "Denzel";
        System.out.println(friendsArray2[0]);

        friendsArrayList2.set(0, "Don");
        System.out.println(friendsArrayList2.get(0));

        friendsArrayList2.remove("Don");
        System.out.println(friendsArrayList2.get(0));

        //print array
        System.out.println(friendsArray2);
        System.out.println(friendsArrayList2);

        for(int i=0; i<friendsArray2.length; i++){
            System.out.println(friendsArray2[i]);
        }

    }
}
