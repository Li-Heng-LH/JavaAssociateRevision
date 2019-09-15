package mainApp.inheritance;

public class SuperClass {

    private int superInt;

    public SuperClass() {
        System.out.println("Super constructor");
    }

    private void superPrint() {
        System.out.println("Printing in super private method");
    }

    protected void superProtectedPrint() {
        System.out.println("Printing in super protected method");
    }
}
