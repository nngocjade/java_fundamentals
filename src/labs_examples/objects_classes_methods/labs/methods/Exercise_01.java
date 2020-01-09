package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {
        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        multiply(3,5);
        divide(4,6);
        System.out.println("Why did the grocery delivery guy get fired?");
        joke();

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static void multiply(int a, int b) {
        int multiply = a * b;
        System.out.println("a * b = " + multiply);
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static void divide(int a, int b) {
        int divide = a / b;
        System.out.println("a / b = " + divide);
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static String joke() {
        String aJoke = new String ("He drove people bananas!");
        System.out.println(aJoke);
        return aJoke;
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents


    // 5) Create a varargs method that will return the length of the varargs array passed in






}
