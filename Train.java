//super with shadowed fields: parent has string name="parent".child extends it and has string name="child".in a child method,,print name, this.name, and super.name.
//input: none.create a child and call the method.
//output: the three different name values.


class Parent {
    String name = "parent";
}
class Child extends Parent {
    String name = "child";

    void display() {
        System.out.println(name);        // child class field
        System.out.println(this.name);   // child class field
        System.out.println(super.name);  // parent class field
    }
}
public class Train {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}