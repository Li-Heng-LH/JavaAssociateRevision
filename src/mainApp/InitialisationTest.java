package mainApp;

public class InitialisationTest {
    private char c;
    private double d;
    private float f;

    public static void DoubleInitialisationTest() {
        //Not allowed to initialise with no value.
        //Double d = new Double();

        //unnecessary boxing
        // Double d = new Double(0.0);

        Double d = 0.0;
        System.out.println(d);
    }

    public void initialiseCDF() {
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("f: " + f);
    }
}
