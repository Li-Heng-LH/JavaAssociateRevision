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

    public static void cloneIsNotSymbolicLink() {
        ArrayList<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo(0, "abc"));
        ArrayList<Foo> fooList2 = (ArrayList<Foo>) fooList.clone();

        fooList.set(0, new Foo(999, "xyz"));

        System.out.println(fooList2.get(0));
    }

    public static void removeNewTest() {
        List<Foo> arrayList = new ArrayList<>();
        arrayList.add(new Foo(0, "abc"));
        arrayList.add(new Foo(99, "xyz"));
        arrayList.add(new Foo(0, "abc"));
        arrayList.add(new Foo(99, "xyz"));


        arrayList.remove(new Foo(0,"abc"));

        for (Foo foo: arrayList) {
            System.out.println(foo);
        }
    }

    public static void removeNewStringTest() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add(new String("abc"));
        arrayList.add(new String("efg"));
        arrayList.add(new String("abc"));
        arrayList.add(new String("efg"));

        arrayList.remove(new String("abc"));

        for (String str : arrayList) {
            System.out.println(str);
        }
    }

    public static void testRemove() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(0);

        //compiler applies autoboxing here
        //because int is passed as parameter to a method that expects Integer.
        System.out.println("Index of 0: " + arrayList.indexOf(0));
        arrayList.remove(arrayList.indexOf(0));
        System.out.println(arrayList);
    }

    public static void testRemoveIdxOrObj() {
        List<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(100);
        list.add(0);
        System.out.println(list);

        //remove at INDEX!
        //Autoboxing will not apply here as method matching is done first!
        //list.remove(100);

        list.remove(Integer.valueOf(100));
        System.out.println(list);
    }
}
