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

        //same class - static calling static
        staticMethod();
        int divide = divide(12,6);
        System.out.println(divide);
        //same class - static calling non-static
        StaticNonStatic_Exercise_1 object = new StaticNonStatic_Exercise_1();
        object.nonStaticMethod();
        StaticNonStatic_Exercise_1 multiply = new StaticNonStatic_Exercise_1();
        multiply.multiply(22.22,33.33);
        //static calling non-static - another class
        System.out.println("printing static method calling a non-static method - another class ");
        Backpack bag = new Backpack("A Book Bag");
        // static calling static - another class
        System.out.println("printing static method calling a static method - another class ");
        Backpack.portableOrNot();


    }
    public static void staticMethod(){
        System.out.println("printing static method calling static method - same class");
    }
    public static int divide(int a, int b){
        return a*b;
    }
    public void nonStaticMethod(){
        System.out.println("printing static method calling non-static method - same class");
    }
    public void multiply(double a, double b){
        double x = a*b;
        System.out.println(x);
    }
    public void nonStatic1(){
        nonStatic2();
    }
    public void nonStatic2(){
        System.out.println("(static main method calling nonStatic1) to print (nonStatic2 calling from nonStatic1)");
    }


}
class Backpack {
    String type;
    static int strap;
    static String portable;
    static boolean isNotPortable;

    public Backpack(){
    }
    public Backpack(String type) {
        this.type = type;
        System.out.println(type);
    }
    public static void portableOrNot(){
        portable = "is portable";

        System.out.println(portable);
    }
}
