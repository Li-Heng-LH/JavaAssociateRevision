package mainApp;

public class StringBuilderTest {

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
}
