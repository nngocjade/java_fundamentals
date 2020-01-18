package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import javax.xml.crypto.KeySelector;

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
        //objects
        Bag bag = new Bag();
        BackPack backPack = new BackPack();

        //invoking methods
        bag.Purpose("anything", "shape");
        backPack.Purpose("travel", "cuboid");//overriding parent method

    }


}

//  1) Demonstrate the three forms of Polymorphism:
// *     - Overloading
// *     - Overriding
// *     - Interfaces
interface Features{
    public boolean Portable();
    public void Fashion();
    public void Functional();
}
class Bag{
    private int size;
    private boolean pocket;
    private String use;
    private String shape;

    public Bag(){
    }
    //example of constructor overloading
    public Bag(int size, boolean pocket, String use, String shape) {
        this.size = size;
        this.pocket = pocket;
        this.use = use;
        shape = shape;
    }
    //example of constructor overloading
    public Bag(String use, String shape) {
        this.use = use;
        shape = shape;
    }
    public void Purpose(String use, String shape){
      this.use = use;
      this.shape = shape;

        System.out.println("Invoking from parent class: " + "A bag can be used for " + use + " and has all sorts of " + shape + "s");
    }

}
class BackPack extends Bag {
    private int numPocket;
    private String compartment;
    private String strap;
    private String padding;

    public BackPack() {
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

    @Override
    public void Purpose(String use, String shape) {
        //overriding parent method (Purpose) with a different System.out.println()
        System.out.println("This bag is used for " + use + "ing" + " and is shaped like a " + shape);
    }

}

//Backpack implementing Features
class Backpack implements Features{


    @Override
    public boolean Portable() {
        return false;
    }

    @Override
    public void Fashion() {

    }

    @Override
    public void Functional() {

    }
}
