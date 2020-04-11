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

    //try and no need catch
    //throws to handle it
    //Exception thrown is popped to main(),
    //finally block is always executed
    public static void testLongRunFinally() throws Exception  {
        try {
            throw new Exception();
        }
        finally {
            for (int i =0; i< 10; i++) {
                System.out.println("Finally ... " + i);
                Thread.sleep(1000);
            }
        }
    }

    private void aMethodThatThrowsException() throws Exception {}

    private void justLikeANormalOne() {
        try {

        } finally {

        }
    }

    //Need to catch to handle the exception
    private void catchAndDoNothingIsFine()  {
        try {
            throw new Exception();
        } catch (Exception e) {

        }
    }

    //Need to throws to handle the exception
    private void needToThrows() throws Exception {
        try {
            aMethodThatThrowsException();
        } finally {

        }
    }
}
