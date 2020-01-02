package labs_examples.arrays.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
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

        //declared and initialized array, also print to screen
        System.out.println("length of array is: 10");
        int[] userInputsElement = new int[10];


        //prompt the elements from userInputsElements. i in this case is the index
        for (int i = 0; i < userInputsElement.length; i++) {
            if (i == 0) {
                System.out.println("Enter a number: ");
                userInputsElement[i] = scanner.nextInt();
            }
            else if (i > 0) {
                System.out.println("Enter another number: ");
                userInputsElement[i] = scanner.nextInt();
            }
            }

        System.out.println("\n");//extra space in between lines

        //prints the array of user input
        System.out.println("Here are the numbers entered for the array: ");
        System.out.println(Arrays.toString(userInputsElement));
        }

        }


