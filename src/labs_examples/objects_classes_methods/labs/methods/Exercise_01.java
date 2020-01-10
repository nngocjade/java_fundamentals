package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {
        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 3;
        int b = 5;
        int m = multiply(a, b);
        int d = divide(a, b);
        String j = joke();
        yearToSeconds(2);
        varargs(1,2,32,4,44,6,65,8,55,20);

        System.out.println(a + " * " + b + " = " + m);
        System.out.println(a + " / " + b + " = " + d);
        System.out.println("A joke: " + joke());





    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static String joke() {
        String aJokeAnswer = new String ("Why did the grocery delivery guy get fired?" + "\n" + "He drove people bananas!");
        return aJokeAnswer;
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearToSeconds(int year) {
        //1 year = 31,556,952 sec
        int totalSeconds = year * 31556952;
        System.out.println(year + " year(s) = " + totalSeconds + " seconds");
        return totalSeconds;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static void varargs(int...a) {
        //Syntax of varargs :
        //A variable-length argument is specified by three periods(…).
        for (int i : a){
            System.out.println(i + " ");
        }
        System.out.println("The array length is " + a.length);
    }
}
