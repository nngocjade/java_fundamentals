package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class Exercise_2{
    public static void main(String[] args) {

        int [] a = anArray(0,6,22,54,12);

        try {
            int x = a[4] / a[0]; //ArrayIndexOutOfBoundsException
            //int x = a[4] / a[5]; ArithmeticException
        } catch (ArrayIndexOutOfBoundsException aeExc){
            System.out.println("An array index out of bound");
        } catch (ArithmeticException arExc){
            System.out.println("Not divisible by an index out of bound");
        } catch (Exception exc){
            System.out.println("error detected");
        }
        System.out.println("end of program");
    }
    public static int[] anArray(int...anArray){
        return anArray;
    }
}
