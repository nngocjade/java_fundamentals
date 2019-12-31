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
        //ask for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        //user input
        String userInput = scanner.next();
        //define variables
        int count = 0;
        int inputLength = userInput.length();
        String vowels = "aeiouy";
        boolean vowelFound = false;
        //execute defined variables and user input
        while (count < inputLength){
            char c = userInput.charAt(count);
            if(vowels.indexOf(c) != -1){
                System.out.println("The First vowel in " + userInput + " is " + c);
                vowelFound = true;
                break;
            }
            count++;
        }

        if(vowelFound == false){
            System.out.println("The word you entered (" + userInput + ") does not contain a vowel");
        }
    }
}
