package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_1{
    public static void main(String[] args) {

        try{
            System.out.println(divide(12, 0));
        }catch(ArithmeticException arExc) {
            System.out.println("Not divisible by 0");
        }catch (Exception aeExc){
            System.out.println("Error detected");
        }
    }
    public static int divide(int a, int b){
        return a / b;
    }
}