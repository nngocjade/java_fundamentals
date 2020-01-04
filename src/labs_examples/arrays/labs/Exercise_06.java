package labs_examples.arrays.labs;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
public class Exercise_06 {
    public static void main(String[] args) {
        int [] array = new int [5];
        reverse(array);

        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        array [3] = 4;
        array [4] = 5;


        //populate array
        for ( int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array [i] = array[array.length - 1 - i];
            array [ array.length - 1 - i] = temp;
        }
        System.out.print(Arrays.toString(array) + " ");
    }

}
