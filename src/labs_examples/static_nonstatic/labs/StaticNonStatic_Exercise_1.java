package labs_examples.static_nonstatic.labs;

/**
 * 1) A static method calling another static method in the same class
 * 2) A static method calling a non-static method in the same class
 * 3) A static method calling a static method in another class
 * 4) A static method calling a non-static method in another class
 * 5) A non-static method calling a non-static method in the same class
 * 6) A non-static method calling a non-static method in another class
 * 7) A non-static method calling a static method in the same class
 * 8) A non-static method calling a static method in another class
 */

public class StaticNonStatic_Exercise_1 {
    public static void main(String[] args) {
        Backpack bag1 = new Backpack("Book Bag");
        Backpack bag2 = new Backpack("Hiking");
        Backpack bag3 = new Backpack("Day Pack");

        //same class - static calling static
        staticMethod();
        //same class - static calling non-static
        StaticNonStatic_Exercise_1 object = new StaticNonStatic_Exercise_1();
        object.nonStaticMethod();
        //another class - static calling static

        //another class - static calling non-static


    }
    public static void staticMethod(){
        System.out.println("prints static method");
    }
    public void nonStaticMethod(){
        System.out.println("print non static method");
    }

}
class Backpack {
    String type;
    static int strap;
    static boolean portable;
    static boolean isNotPortable;

    public Backpack(){
    }

    public static void main(String[] args) {
        //in same class
        //static calling static
        portableOrNot();
        System.out.println(portable);
    }

    public Backpack(String type) {
        this.type = type;
    }


    public static void portableOrNot(){
        portable = true;
        isNotPortable = false;
    }
}
