package mainApp;

public class TestTryCatch {

    public static void testFinally() throws Exception {

        try {
            System.out.println("Trying...");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Caught Exception. Throwing to main...");
            throw e;
        } finally {
            System.out.println("Finally...");
        }
    }
}
