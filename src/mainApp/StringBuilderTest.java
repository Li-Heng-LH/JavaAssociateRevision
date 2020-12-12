package mainApp;

import java.time.Duration;
import java.time.Instant;

public class StringBuilderTest {

    private static final int NUMBER_OF_TIMES = 100000;

    public static void toStringTest() {
        StringBuilder sb = new StringBuilder("abc");
        String s1 = sb.toString();
        String s2 = sb.toString();

        //Returns false
        //A new String object is allocated and initialized each time toString() is called
        System.out.println(s1 == s2);
    }

    public static void toStringTest2() {
        StringBuilder sb = new StringBuilder("abc");
        String str = sb.toString();
        sb.append("defg");

        //str should still be abc.
        //Subsequent changes to this sequence do not affect the contents of the String.
        System.out.println(str);
    }

    public static void sbEqualsStrTest() {
        StringBuilder sb = new StringBuilder("abc");
        String str = "abc";

        //should both returns false.
        //str and sb different objects.
        System.out.println(str.equals(sb));
        System.out.println(sb.equals(str));
    }

    public static void constructWithCapacity() {
        //SB constructor takes in capacity
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.capacity());
    }

    public static void capacityIncrement() {
        //SB capacity increases by (oldcapacity*2)+2
        StringBuilder sb = new StringBuilder(3);
        System.out.println("capacity: " + sb.capacity()); //3
        sb.append("abc");
        System.out.println("capacity: " + sb.capacity()); //3
        sb.append("a");
        System.out.println("capacity: " + sb.capacity()); //8
    }

    public static void builderVSConcat() {
        StringBuilder sb = new StringBuilder("HAHA");
        Instant start = Instant.now();
        for (int i = 0; i < NUMBER_OF_TIMES; i++) {
            sb.append("HAHA");
        }
        Instant finish = Instant.now();
        System.out.println("StringBuilder Time: " + Duration.between(start, finish).toMillis() +  " milliseconds.");
        System.out.println("length of sb: " + sb.length());

        String str = "HAHA";
        start = Instant.now();
        for (int i = 0; i < NUMBER_OF_TIMES; i++) {
            str += "HAHA";
        }
        finish = Instant.now();
        System.out.println("String Concat Time: " + Duration.between(start, finish).toMillis() +  " milliseconds.");
        System.out.println("length of string: " + str.length());
    }
}
