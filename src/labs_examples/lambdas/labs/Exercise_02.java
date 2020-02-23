package labs_examples.lambdas.labs;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_2{
    public static void main(String[] args) {
        DoubleToIntFunction df = (x) -> {
            return (int)x*2;};
        System.out.println("Double to Int Function: "+ df.applyAsInt(12.54));


    }
}