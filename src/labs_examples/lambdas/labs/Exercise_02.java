package labs_examples.lambdas.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
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
        //Double To Int Function
        DoubleToIntFunction df = (x) -> {
            return (int)x*2;};
        System.out.println("Double to Int Function: "+ df.applyAsInt(12.54));

        //BiFunction - as a parameter
        Calculator calculator = new Calculator();
        String result = calculator.calc((a,b) -> "BiFunction - as a parameter: " + (a * b), 12, 5);
        System.out.println(result);


    }
}
class Calculator{
    public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2){
        return bi.apply(i1, i2);
    }
}