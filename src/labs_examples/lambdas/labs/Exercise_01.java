package labs_examples.lambdas.labs;

import java.sql.SQLOutput;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

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
        AnInterface lambdaInterface = () -> {
            int a = 12;
            int b = 11;

            int c = a * b;
            System.out.println("empty parameter - Lambda expression - " + c);
        };
        lambdaInterface.noParameter();

        //anonymous inner class
        AnInterface anonymousInterface = new AnInterface() {
            @Override
            public void noParameter() {
                int a = 12;
                int b = 12;

                int c = a * b;
                System.out.println("empty parameter - Anonymous inner - " + c);
            }
        };
        anonymousInterface.noParameter();

        //        *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//        *          an anonymous inner class from this interface.

        OneParameterInterface lamndaNum = (d) -> d;

        System.out.println("One parameter Interface - Lambda expression - "+ lamndaNum.number(3.14));

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
        MathInterface lambdaDivide = (a, b) -> (a / b);
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

        //        *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.

        //Binary
        BinaryOperator<Integer> intB = Integer::sum;
        System.out.println("Binary Operator - sum of two numbers - " + intB.apply(7,8));

        //Double Binary
        DoubleBinaryOperator db = (x, y) -> x*y;
        System.out.println("Double Binary Operator - multiplication of two numbers - " + db.applyAsDouble(3.34,4.44));

        //Function
        Function<Integer, String> intToString = (i) -> Integer.toString(i);
        System.out.println("Function - conversion - " + intToString.apply(456754).length());

        //Unary Operator
        UnaryOperator<String> i = (x) -> x.replace('d','b');
        System.out.println(i.apply("Unary Operator - replacing old char with new char - " + "doggie"));
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

//done


