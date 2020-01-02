package labs_examples.arrays.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] userInputs = new int[10];
        //prompt user
        System.out.println("Enter variable "); //variable is the userInput
        for (int i = 0; i < userInputs.length; i++) {
            for (int x = 0; x < userInputs.length; i++) {
                System.out.println("Enter next variable ");
                userInputs[i] = scanner.nextInt();
            }
        }

    }
}