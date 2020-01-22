package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class Exercise_3{
    public static void main(String[] args) {

        boolean t = trueOrFalse(true);

        try{
            t = false;
        }catch (ArithmeticException aeExc){
            System.out.println("boolean value is not false");
        }finally {
            System.out.println("boolean value will always be true");
        }

    }
    public static boolean trueOrFalse(boolean b){
        return b;
    }
}