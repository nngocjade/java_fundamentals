package labs_examples.arrays.labs;

import java.util.Scanner;
/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        System.out.println("Enter a number between 1 and 10 (including 1 or 10): ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        int length = array.length;//length of an array

        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == userInput ){ // userInput now matches the element at Array[i]
                index = i;//then returns the index for userInput (element at Array[i])
            }
        }
        System.out.println(index);//prints the index for userInput (element at Array[i])
        }
    }
