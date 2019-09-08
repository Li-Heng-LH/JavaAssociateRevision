package mainApp;

public class ChildTwo extends Parent {

    public void print(){
        //can access default-access parent attribute in same package even though not protected
        System.out.println(i2);
    }
}
