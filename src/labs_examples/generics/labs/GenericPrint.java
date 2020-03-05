package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

public class GenericPrint {
    //  Create a generic class called Generic

        //  Inside generic, create a method called printArray()
        public static < E extends Collection<String>> void printArray(E inputArray ) {
            // Display array elements
            for(String element : inputArray) {
                System.out.printf(element);
            }
            System.out.println();
        }
//  printArray must print the contents of an array that receives as a parameter

}
class Control{
    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<>();

        s.add("b");
        s.add("a");

        GenericPrint.printArray(s);
    }
}