package mainApp.inheritance;

public class SubClass extends SuperClass {

    private int subInt;

    public SubClass() {
        System.out.println("Sub constructor");
    }

    public void subPrint() {
        //Cannot access parent private methods here also
        //superPrint();

        super.superProtectedPrint();
        System.out.println("Printing from subclass");
    }
}
