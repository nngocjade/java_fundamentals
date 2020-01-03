package labs_examples.arrays.labs;

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
            int[][] irreg_array = new int[5][];

            //First row has 4 columns
            irreg_array[0] = new int[4];
            //Second row has 7 columns
            irreg_array[1] = new int[7];
            //Third row has 2 columns
            irreg_array[2] = new int[2];
            //fourth row has 3 columns
            irreg_array[3] = new int[3];
            //fifth row has 2 columns
            irreg_array[4] = new int[2];

            int count = 0;
            //Initializing array w/ for loop to iterate
            for (int i = 0; i < irreg_array.length; i++) {
                for (int k = 0; k < irreg_array[i].length; k++) {
                    irreg_array[i][k] = count++;
                }
            }
            //using for each loop to print elements here
            // since for each loop doesn't use an index or iterator
            System.out.println("Content of 2D irregular array ");
            for (int [] outerElement: irreg_array) {
                for (int val : outerElement) {
                    System.out.print(val + " , ");// using System.out.print to print in line
                }
                //prints next row
                System.out.println();
            }
    }
}
