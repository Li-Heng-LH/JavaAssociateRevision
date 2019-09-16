package mainApp.orders;

public class StringTest {

    public static void replaceTest() {
        String str = "Hello";
        System.out.println(str.replace('l', 'L'));
        //System.out.println(str.replace('ll', 'LL')); //error
        System.out.println(str.replace("l", "L"));
        System.out.println(str.replace("ll", "LL"));
    }
}
