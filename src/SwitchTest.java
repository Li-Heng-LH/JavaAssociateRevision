public class SwitchTest {

    //cases are evaluated first,
    //default not triggered,
    //cases fall through
    public static void oneCaseMet_defaultOnTop() {
        int i = 9;

        switch (i) {
            default:
                System.out.println("Default");
            case 1:
                System.out.println(1);
            case 3:
                System.out.println(3);
            case 9:
                System.out.println(9);
            case 99:
                System.out.println(99);
            case 999:
                System.out.println(999);
        }
        //Expected : 9, 99, 999
    }
}
