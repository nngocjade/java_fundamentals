package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_6 {
    public static void main(String[] args) {

        try {
            int x = anArray(12);
            System.out.println(x);
        } catch (IndexOutOfBoundsException aeExc) {
            System.out.println("Error: index out of bound");
        }
        System.out.println("end of program");
    }

    public static int anArray(int i) throws IndexOutOfBoundsException {
        int[] a = {2, 3, 4, 5, 67, 8};
        return a[i];
    }
}