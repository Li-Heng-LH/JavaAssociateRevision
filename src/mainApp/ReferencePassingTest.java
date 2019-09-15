package mainApp;

public class ReferencePassingTest {

    public static void referenceIsCopied() {
        Message obj = new Message();
        obj.print();
        changeMsg(obj);
        obj.print();
    }

    private static void changeMsg(Message msg) {
        //reference is copied in msg
        msg = new Message();
        //now msg reference is set to point to another object
        msg.message = "Bye bye!";
    }
}


class Message {
    String message = "Hello World";
    public void print() {
        System.out.println(message);
    }

}