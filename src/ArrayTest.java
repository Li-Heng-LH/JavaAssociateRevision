public class ArrayTest {
    public static void initialisationTest() {

        //Double initialised to null. double initialised to 0.0
        Double [] arr = new Double[2];
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        double arr2 [] = new double[2];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        //can print null
        //null + null -> nullPtrExp
        System.out.println(arr[0] + arr[1]);
    }
}
