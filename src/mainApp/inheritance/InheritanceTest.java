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
}
