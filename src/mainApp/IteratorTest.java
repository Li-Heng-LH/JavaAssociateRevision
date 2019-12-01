package mainApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    private static List<String> list = new ArrayList<>();

    public static void testTraversal() {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //Iterator1 finished at last position
        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("End of iterator1: hasNext(): " + iterator1.hasNext());
        System.out.println();

        //Iterator 2 stuck at middle
        Iterator<String> iterator2 = list.iterator();
        System.out.println("Iterator2: ");
        while (iterator2.hasNext()) {
            String current = iterator2.next();
            System.out.println(current);
            if (current.equals("C")) break;
        }
        System.out.println();

        //Iterator3 run fully
        Iterator<String> iterator3 = list.iterator();
        System.out.println("Iterator 3:");
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        System.out.println();
        System.out.println("Iterator 2 after break: " + iterator2.next());
    }
}
