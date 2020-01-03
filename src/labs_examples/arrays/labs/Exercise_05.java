package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int [] array = new int [10];

        array [0] = 22;
        array [1] = 33;
        array [2] = 44;
        array [3] = 55;
        array [4] = 66;
        array [5] = 77;
        array [6] = 88;
        array [7] = 99;
        array [8] = 10;
        array [9] = 11;

        int x = 0;
        for(int i = 9; i >= 0; i -= 2){// the iteration i -= 2 skips every other index
         //i = 9: prints in reverse
            x = array[i];
            System.out.print(x + " ");
        }
    }
}
