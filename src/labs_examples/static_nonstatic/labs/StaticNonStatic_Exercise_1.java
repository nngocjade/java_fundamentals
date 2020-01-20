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
        Backpack type = new Backpack();
        type.backPackType("Book bag");

        // static calling static - another class
        System.out.println("printing static method calling a static method - another class ");
        Backpack.isPortable();

        //static main method calling nonStatic1 to print nonStatic2 calling from nonStatic1 - same class
        System.out.println("printing (static main method calling nonStatic1) to print (non-static multiply calling from nonStatic1)");
        StaticNonStatic_Exercise_1 nonStaticNonStatic = new StaticNonStatic_Exercise_1();
        nonStaticNonStatic.nonStatic1();

        //A non-static method calling a non-static method in another class
        StaticNonStatic_Exercise_1 nonStaticNonStaticAnotherClass = new StaticNonStatic_Exercise_1();
        nonStaticNonStaticAnotherClass.nonStatic2();

        //A non-static method calling a static method in the same class
        
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
        multiply(6,3);
    }
    public void nonStatic2(){
        System.out.println("printing static main method calling nonStatic2 - nonStatic2 calling non-static backPackTyp1 from another class - non-static backPackType1 calling non-static backPackType and non-static isNotPortable");
        Backpack type2 = new Backpack();
        type2.backPackType1();
    }



}
class Backpack {
    protected String type;
    protected static int strap;
    protected static String portable;
    protected static String notPortable;

    public Backpack(){
    }

    public void backPackType(String type) {
        System.out.println(type);
    }
    public void backPackType1(){
        backPackType("not a backpack");
        isNotPortable();
    }
    public void isNotPortable(){
        notPortable = "is not portable";
        System.out.println(notPortable);
    }
    public static void isPortable(){
        portable = "is portable";
        System.out.println(portable);
    }

}
