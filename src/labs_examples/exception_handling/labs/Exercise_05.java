package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 * <p>
 * Demonstrate how to throw an exception.
 */
class Exercise_5 {
    public static void main(String[] args) throws Exception {

        try {
            divide(4, 0);
        } catch (ArithmeticException arExc) {
            System.out.println("not divisible by 0");
        }
    }

    public static void divide(int a, int b) throws Exception {

        try {
            int x = a / b;
            System.out.println(a + " / " + b + " = " + x);
        } catch (Exception e) {
            System.out.println("Error detected");
            throw e;
        }

    }
}