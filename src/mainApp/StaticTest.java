package mainApp;

public class StaticTest {
    private static int abc = 0;

    public static int getAbc() {
        return abc;
    }

    public static void setAbc(int abc) {
        StaticTest.abc = abc;
    }
}

