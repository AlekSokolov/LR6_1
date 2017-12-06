import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List myList = null;
        String collectionType = "LinkedList";
        if (collectionType.equals("ArrayList")) {
            myList = new ArrayList();
        } else if (collectionType.equals("LinkedList")) {
            myList = new LinkedList();
        }
        List filledCollection = fillCollection(myList);
        printCollection(myList);
    }

    public static List fillCollection(List collection) {
        for (int i = 0; i < 3; i++) {
            collection.add(i);
        }
        return collection;
    }

    public static void printCollection(List collection) {
        for (int i = 0; i < 3; i++) {
            System.out.println(collection.getClass() + " Элемент: " + collection.get(i));
        }

    }


}

