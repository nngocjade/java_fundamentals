package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a collection of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 *      5)
 */

public class Exercise_03 {
    public static void main(String[] args) {
        System.out.println(add(4.5,5.6));


    }

//     1) Write a generic method that accepts two generic arguments. This generic method should only accept
//     arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
//     numbers were passed in regardless of their type.
    public static<T extends Number> T add(T x, T y){
    Double sum;
    sum = x.doubleValue() + y.doubleValue();
    return (T) sum;
}

//     2) Write a generic method to count the number of elements in a collection of Strings that are palindromes

//     3) Write a generic method to exchange the positions of two different elements in an array.

//     4) Write a generic method to find the largest element within the range (begin, end) of a list.
}

//    //  Inside generic, create a method called printArray()
//    public static <T> List<T> printArray(T... elements){
//        List<T> lst = new ArrayList<>();
//        for(T element: elements) {
//            lst.add(element);
//        }
//        return lst;
//
////  printArray must print the contents of an array that receives as a parameter
//    }