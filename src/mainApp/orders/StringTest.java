package mainApp.orders;

import java.sql.SQLOutput;

public class StringTest {

    public static void replaceTest() {
        String str = "Hello";
        System.out.println(str.replace('l', 'L'));
        //System.out.println(str.replace('ll', 'LL')); //error
        System.out.println(str.replace("l", "L"));
        System.out.println(str.replace("ll", "LL"));
    }

    public static void assignThenPrintTest() {
        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2);
        System.out.println(str1);
    }
}
