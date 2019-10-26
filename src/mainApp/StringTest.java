package mainApp;

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

    public static void printTest() {
        System.out.println(new String("hello")); //hello
        System.out.println(new StringBuilder("hello")); //hello
        System.out.println(new SpecialString("hello")); //Class@address
    }

    public static void testStringPoolWithEmptyString() {
        String str1 = "ABCD";
        String str2 = "ABCD";
        System.out.println(str1 == str2); //true

        String str3 = "ABCD" + "";
        System.out.println(str1 == str3); //true
        System.out.println(str2 == str3); //true
    }
}

class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}