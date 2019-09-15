package mainApp.inheritance;

public class InheritanceTest {

    public static void testSuperConstruct() {
        SubClass sc = new SubClass();
    }

    public static void testAccessingParentPrivate() {
        SubClass sc = new SubClass();

        //Cannot call parent private methods from here
        //sc.superPrint();

        sc.subPrint();
    }

    public static void testMultipleChildren() {
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass();

        System.out.println(sc1.superInt);
        System.out.println(sc2.superInt);

        sc1.superInt += 99;
        sc2.superInt += 88;

        System.out.println(sc1.superInt);
        System.out.println(sc2.superInt);
    }
}
