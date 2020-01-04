package mainApp;

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

    //Fall through with default triggered
    public static void oneCaseMet_defaultAtBottom() {
        int i = 9;

        switch (i) {
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
            default:
                System.out.println("Default");
        }
        //Expected : 9, 99, 999, Default
    }

    //Trigger default, then fall through
    public static void noCaseMet_defaultOnTop(){
        int i = 9;

        switch (i) {
            default:
                System.out.println("Default");
            case 1:
                System.out.println(1);
            case 3:
                System.out.println(3);
            case 19:
                System.out.println(19);
            case 99:
                System.out.println(99);
            case 999:
                System.out.println(999);
        }
        //Expected : Default, 1, 3, 19, 99, 999
    }


    public static void noCaseMet_defaultAtBottom() {
        int i = 9;

        switch (i) {
            case 1:
                System.out.println(1);
            case 3:
                System.out.println(3);
            case 19:
                System.out.println(19);
            case 99:
                System.out.println(99);
            case 999:
                System.out.println(999);
            default:
                System.out.println("Default");
        }
        //Expected : Default
    }

    public static void testSwitchOnWrapperClass() {
        Integer var = 7;

        switch (var) {
            case 7:
                System.out.println("Lucky 7");
                break;
                default:
                    System.out.println("Not 7");
        }
    }

    public static void testSwitchOnByte() {
        byte var = 100;

        switch (var) {
            case 100:
                System.out.println("100");
                break;
            //case 128: //128 will compile error as 128 is outside byte range (-128 to 127)
                //System.out.println("128");
                //break;
            default:
                System.out.println("Default");
        }
    }

}
