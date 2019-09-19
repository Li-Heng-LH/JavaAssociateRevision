package mainApp;

import java.util.*;

public class ArrayListTest {

    public static void initialisationTest() {
        ArrayList<Double> arrayList = new ArrayList<>(10);

        //empty ArrayList -> accessing index will get error
        //System.out.println(arrayList.get(0));
    }

    //look for whole string
    public static void replaceStringTest() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("l");
        arrayList.replaceAll(s -> s.equals("l") ? "L" : s);
        System.out.println(arrayList.toString());
    }

    public static void storeStringTest() {
        List<String> arrayList = new ArrayList<>();
        String str = "hello";
        arrayList.add(str);
        arrayList.add(str);

        //String is immutable
        str.replace('l', 'L');

        System.out.println(arrayList.toString());
    }

    public static void storeReferenceTest() {
        List<Foo> arrayList = new ArrayList<>();
        Foo foo = new Foo(1, "a");
        arrayList.add(foo);
        arrayList.add(foo);
        System.out.println(arrayList);

        foo.setId(2);
        foo.setName("B");
        System.out.println(arrayList);
    }

    public static void cloneTest() {
        ArrayList<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo(0, "abc"));
        ArrayList<Foo> fooList2 = (ArrayList<Foo>) fooList.clone();

        fooList.get(0).setId(999);
        fooList.get(0).setName("xyz");

        //clone returns a shallow copy. Both lists pointing to same object
        System.out.println(fooList2.get(0));
    }
}
