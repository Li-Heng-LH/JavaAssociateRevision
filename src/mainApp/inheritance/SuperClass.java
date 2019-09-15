package mainApp.inheritance;

public class SuperClass {

    public int superInt = 0;

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
