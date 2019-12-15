package mainApp;

public class ReferencePassingTest {

    public static void referenceIsCopied() {
        Message obj = new Message("Hello World");
        obj.print(); //"Hello World"
        changeMsg(obj); //reference is COPIED into method
        obj.print(); //Still the same reference as before, therefore, "Hello World"
    }

    private static void changeMsg(Message msg) {
        //reference obj is copied into msg
        //msg is another reference, not the same as obj
        msg = new Message("Bye bye");
        System.out.println(msg.message); //"Bye bye"
    }
}


class Message {
    String message;
    public Message (String message) {
        this.message = message;
    }
    public void print() {
        System.out.println(message);
    }

}