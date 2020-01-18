package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

/**
 * 1) Demonstrate the three forms of Polymorphism:
 *     - Overloading
 *     - Overriding
 *     - Interfaces
 *
 * 2) Demonstrate the three forms of polymorphism again - but in a new set of classes. We want to lock this in.
 * Challenge yourself. Build something you're proud of.
 *
 * 3) Demonstrate using an interface as an instance variable - have a constructor that takes in the interface as a
 * parameter. Also have a setter that allows you to update the interface object. Through code, demonstrate that you
 * understand how we can use Interfaces as dependencies (instance variables) and how useful and flexible they make our
 * application.
 */

public class Exercise_1 {
    public static void main(String[] args) {

    }
}

//  1) Demonstrate the three forms of Polymorphism:
// *     - Overloading
// *     - Overriding
// *     - Interfaces
class Bag{
    private int size;
    private boolean pocket;
    private String use;
    private String Shape;

    public Bag(){
    }
    //example of constructor overloading
    public Bag(int size, boolean pocket, String use, String shape) {
        this.size = size;
        this.pocket = pocket;
        this.use = use;
        Shape = shape;
    }
    //example of constructor overloading
    public Bag(String use, String shape) {
        this.use = use;
        Shape = shape;
    }

}
class BackPack extends Bag{
    private int numPocket;
    private String compartment;
    private String strap;
    private String padding;

    public BackPack(){
    }

    public BackPack(int numPocket, String compartment, String strap, String padding) {
        this.numPocket = numPocket;
        this.compartment = compartment;
        this.strap = strap;
        this.padding = padding;
    }

    public BackPack(int size, boolean pocket, String use, String shape, int numPocket, String compartment, String strap, String padding) {
        super(size, pocket, use, shape);
        this.numPocket = numPocket;
        this.compartment = compartment;
        this.strap = strap;
        this.padding = padding;
    }

    public BackPack(String use, String shape, int numPocket, String compartment, String strap, String padding) {
        super(use, shape);
        this.numPocket = numPocket;
        this.compartment = compartment;
        this.strap = strap;
        this.padding = padding;
    }

}
