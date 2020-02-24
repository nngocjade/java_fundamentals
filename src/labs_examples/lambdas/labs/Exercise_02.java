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
        //1
        //Double To Int Function
        //DoubleToIntFunction represents a function that accepts a double-valued argument and produces an int-valued result.
        // This is the double-to-int primitive specialization for Function.
        DoubleToIntFunction df = (x) -> {
            return (int)x*2;};
        System.out.println("Double to Int Function: "+ df.applyAsInt(12.54));

        //2
        //BiFunction - as a parameter
        //BiFunction represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
        Calculator calculator = new Calculator();
        String result = calculator.calc((a,b) -> "BiFunction - as a parameter: " + (a * b), 12, 5);
        System.out.println(result);

        //3
        //BiPredicate - represents a predicate which is a boolean-valued function of two arguments.
        BiPredicate<Integer, Integer> bi = (x, y) -> (x > y);
        System.out.println("BiPredicate - boolean - value: " + bi.test(5, 3));

        //4
        //Boolean-supplier
        BooleanSupplier bs = () -> false;
        System.out.println("declared default boolean value: " + bs.getAsBoolean());

        int x = 12, y= 1;
        bs = () -> x > y;
        System.out.println("result: " + bs.getAsBoolean());

        //5
        //Consumer - represents an operation that accepts a single input argument and returns no result.
        Consumer <String> c = (z) -> System.out.println("Consumer: " + z.toLowerCase());
        c.accept("JADE");

        //6
        //LongUnaryOperator represents an operation on a single long-valued operand that produces a long-valued result.
        // This is the primitive type specialization of UnaryOperator for long.
        LongUnaryOperator i = (l) -> -l;
        System.out.println("LongUnaryOperator: " + i.applyAsLong(Long.MAX_VALUE));

        //7
        //ObjIntConsumer represents an operation that accepts an object-valued and a int-valued argument, and returns no result.
        // This is the reference, int specialization of BiConsumer.
        ObjIntConsumer<String> j  = (s,d)->System.out.println("ObjIntConsumer: " + s+d);
        j.accept("java2s.com ",234);

        //8
        //Predicate isEqual returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object).
        Predicate<String> p = Predicate.isEqual("randomword");
        System.out.println("Predicate isEqual returns boolean: " + p.test("mynameisjade"));

        //9
        //ToDoubleBiFunction represents a function that accepts two arguments and produces a double-valued result.
        // This is the double-producing primitive specialization for BiFunction.
        ToDoubleBiFunction<Integer,Long> t  = (k,l)-> Math.sin(x)+Math.sin(y);
        System.out.println("To Double Bi Funtion: " + t.applyAsDouble(Integer.MAX_VALUE, Long.MAX_VALUE));

        //10
        //ToIntFunction represents a function that produces an int-valued result.
        // This is the int-producing primitive specialization for Function.
        ToIntFunction<String> q  = (w)-> Integer.parseInt(w);
        System.out.println("to Int Function: " + q.applyAsInt("2"));
    }
    }

class Calculator{
    public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2){
        return bi.apply(i1, i2);
    }
}
