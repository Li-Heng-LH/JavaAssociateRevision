public class StringBuilderTest {

    public void toStringTest() {
        StringBuilder sb = new StringBuilder("abc");
        String s1 = sb.toString();
        String s2 = sb.toString();

        //Returns false
        //A new String object is allocated and initialized each time toString() is called
        System.out.println(s1 == s2);
    }

    public void toStringTest2() {
        StringBuilder sb = new StringBuilder("abc");
        String str = sb.toString();
        sb.append("defg");

        //str should still be abc.
        //Subsequent changes to this sequence do not affect the contents of the String.
        System.out.println(str);
    }
}
