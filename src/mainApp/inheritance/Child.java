package mainApp.inheritance;

import mainApp.Parent;

public class Child extends Parent {

    public void print() {
        Parent parent = new Parent();
        //inheritance: cannot access protected in a parent instantiation (in different package)
        //System.out.println(parent.i1); //give error
        System.out.println(i1);
        System.out.println(this.i1);
        System.out.println(super.i1);

        //cannot access default-access parent attribute from different package
        //System.out.println(i2);//give error
    }
}
