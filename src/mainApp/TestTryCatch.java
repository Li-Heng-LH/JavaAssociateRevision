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

    public static void testLongRunFinally() throws Exception  {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw e;
        } finally {
            for (int i =0; i< 10; i++) {
                System.out.println("Finally ... " + i);
                Thread.sleep(1000);
            }
        }
    }
}
