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



        try{
            int num1;
            int num2;
            int divide;

            Scanner userInput = new Scanner(System.in);
            System.out.println("enter a number");
            num1 = userInput.nextInt();

            System.out.println("enter another number");
            num2 = userInput.nextInt();

            //throw
            divide = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + divide);

        }catch (ArithmeticException e){
            System.out.println("Error: not divisible by 0");
        }
        finally {
            System.out.println("math is awesome");
        }
        System.out.println("End of program");
    }
}