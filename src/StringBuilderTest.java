public class StringBuilderTest {

    public void toStringTest() {
        StringBuilder sb = new StringBuilder("abc");
        String s1 = sb.toString();
        String s2 = sb.toString();

        //Returns false
        //A new String object is allocated and initialized each time toString() is called
        System.out.println(s1 == s2);
    }
}
