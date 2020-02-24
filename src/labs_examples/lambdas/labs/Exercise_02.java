package labs_examples.lambdas.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;


/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_2{
    public static void main(String[] args) {
        //Double To Int Function
        //DoubleToIntFunction represents a function that accepts a double-valued argument and produces an int-valued result.
        // This is the double-to-int primitive specialization for Function.
        DoubleToIntFunction df = (x) -> {
            return (int)x*2;};
        System.out.println("Double to Int Function: "+ df.applyAsInt(12.54));

        //BiFunction - as a parameter
        //BiFunction represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
        Calculator calculator = new Calculator();
        String result = calculator.calc((a,b) -> "BiFunction - as a parameter: " + (a * b), 12, 5);
        System.out.println(result);

        //BiPredicate - represents a predicate which is a boolean-valued function of two arguments.
        BiPredicate<Integer, Integer> bi = (x, y) -> (x > y);
        System.out.println("BiPredicate - boolean - value: " + bi.test(5, 3));

        //Boolean-supplier
        BooleanSupplier bs = () -> false;
        System.out.println("declared default boolean value: " + bs.getAsBoolean());

        int x = 0, y= 1;
        bs = () -> x > y;
        System.out.println("result: " + bs.getAsBoolean());

        //Consumer - represents an operation that accepts a single input argument and returns no result.
        Consumer <String> c = (z) -> System.out.println(z.toLowerCase());
        c.accept("JADE");

        //
    }
    }

class Calculator{
    public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2){
        return bi.apply(i1, i2);
    }
}
