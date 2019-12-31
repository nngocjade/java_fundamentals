package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String[] args) {
        int i = 1000;
        while (i > 0){
            //print value first
            System.out.println(i);
            //then decrement
            i -= 3;
        }
        System.out.println("end of every third number count");
    }
}
