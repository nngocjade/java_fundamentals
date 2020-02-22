package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

class Exercise_1{
    public static void main(String[] args) {

    }

}

//               1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
interface Math{
    public int divide(int a, int b);
}
//        *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//        *          an anonymous inner class from this interface.
class Multiplication implements Math{

    @Override
    public int divide(int a, int b) {
        int m = a / b;
        return m;
    }
}
//        *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
//        *          value of the same type as the parameter
//        *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//        *          an anonymous inner class from this interface.
//        *
//        *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
//        *          value
//        *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//        *          an anonymous inner class from this interface.
//        *
//        *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
//        *
//        *