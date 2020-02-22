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

class Exercise_1 {
    public static void main(String[] args) {

        //      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//        *          an anonymous inner class from this interface.

        //lambda expression
        AnInterface lambdaInterface = Exercise_1::noParameter;
        lambdaInterface.noParameter();

        //anonymous inner class
        AnInterface anonymousInterface = new AnInterface() {
            @Override
            public void noParameter() {
            }
        };
        anonymousInterface.noParameter();

        //        *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//        *          an anonymous inner class from this interface.

        OneParameterInterface lamndaNum = (d) -> {
            return d;
        };

        System.out.println("One parameter Interface - Lambda expression - "+ lamndaNum.number(3.14););

        OneParameterInterface AnonymousNum = new OneParameterInterface() {
            @Override
            public double number(double d) {
                return d;
            }
        };
        System.out.println("One parameter Interface - Anonymous Inner - " +  AnonymousNum.number(3.14));

        //        *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//        *          an anonymous inner class from this interface.

        //lambda expression
        MathInterface lambdaDivide = (a, b) -> {
            int m = a / b;
            return m;
        };
        System.out.println("Two parameter Interface - lambda expression - " + lambdaDivide.divide(12, 6));

        //anonymous inner class
        MathInterface AnonymousDivide = new MathInterface() {
            @Override
            public int divide(int a, int b) {
                int m = a / b;
                return m;
            }
        };
        System.out.println("Two parameter Interface - Anonymous Inner - " + AnonymousDivide.divide(12, 6));
    }

    private static void noParameter() {
    }
}

//               1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
interface AnInterface{
    void noParameter();

}

//        *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
//        *          value of the same type as the parameter
interface OneParameterInterface{
    double number(double d);
}

//        *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
//        *          value
interface MathInterface {
    int divide(int a, int b);
}

//        *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
//        *
//        *