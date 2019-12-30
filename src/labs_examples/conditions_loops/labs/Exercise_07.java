package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hint: there is a helpful method in the String class called charAt() that you'll want to use
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.print("Enter a word: ");
        //User input

        char c = userInput.findInLine("[aeiouy]").charAt(0);
        //Scan for vowel


        //Print first vowel within word
        System.out.println("First vowel: " + c);







    }
}
