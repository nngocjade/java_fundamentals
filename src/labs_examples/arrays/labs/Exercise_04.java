package labs_examples.arrays.labs;
import java.util.Arrays;
/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        //declaring 2D array with 5 rows
        int [][] irreg_array = new int [5][];

        //First row has 4 columns
        irreg_array [0] = new int [4];
        //Second row has 7 columns
        irreg_array [1] = new int [7];
        //Third row has 2 columns
        irreg_array [2] = new int [2];
        //fourth row has 3 columns
        irreg_array [3] = new int [3];
        //fifth row has 2 columns
        irreg_array [4] = new int [2];


        //Initializing array
        int count = 0;
        for (int i = 0; i < irreg_array.length; i++){
            for (int k = 0; k < irreg_array[i].length; k++){
                irreg_array[i][k] = count++;
            }
        }
        //Printing the elements for each row and column
        System.out.println("Content of 2D irregular array ");
        for (int i = 0; i < irreg_array.length; i++){
            for (int k = 0; k < irreg_array[i].length; k++){
                System.out.println(irreg_array[i][k]);

            }
            System.out.println();
        }



    }

}
