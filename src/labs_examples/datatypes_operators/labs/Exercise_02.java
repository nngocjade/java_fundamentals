package labs_examples.datatypes_operators.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int intNum = 10;
        double doubleNum = intNum;
        double dNumNow = 10.5;
        int intNumNow = (int) dNumNow;

        System.out.println("doubleNum = " + doubleNum);
        System.out.println("dNumNow = " + dNumNow);
        System.out.println("intNumNow = " + intNumNow);
        //information is lost in the Narrowing direction, going from a higher data type (double) into a lower data type (int)
    }


}
