package mainApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    public static void testRemoveWhileTraverse(){
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {

            String next = listIterator.next();

            if (next.equals("C")) {
                listIterator.remove(); //remove() removes the last element returned by iterator
            }
        }

        //should remove C
        System.out.println(list);
    }

    public static void testAddWhileTraverse() {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            if (listIterator.next().equals("C")) {
                listIterator.previous();
                listIterator.add("Z");
                listIterator.next();
            }
        }

        //should add Z in front of C
        System.out.println(list);
    }
}
