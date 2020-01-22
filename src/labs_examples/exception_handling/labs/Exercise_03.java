package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class Exercise_3{
    public static void main(String[] args) {

        int correctNum = num(5);

        System.out.println("guess a number between 1 and 10");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");

        String numEntered = userInput.nextLine();
        System.out.println("you entered: "+ numEntered);

        try{

            correctNum = 1;
            correctNum = 2;
            correctNum = 3;
            correctNum = 4;
            correctNum = 6;
            correctNum = 7;
            correctNum = 8;
            correctNum = 9;
            correctNum = 10;

        }catch (ArithmeticException aeExc){
            System.out.println("incorrect");
        }finally {
            System.out.println("you made a guess, sorry incorrect");
        }

    }
    public static int num(int n){
        return n;
    }
}