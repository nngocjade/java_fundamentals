package labs_examples.arrays.labs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        //creating/declaring and array list by name of list
        ArrayList<String> list  = new ArrayList<String>();
        // add values to ArrayList
        list.add("Green");
        list.add("Yellow");
        list.add("Blue");
        list.add("Purple");
        list.add("Red");
        list.add("orange");


        //printing array list by using the for loop
        for (String element : list){
            System.out.println(element);
        }

        //space break
        System.out.println(" ");

        //accessing and printing all elements by iteration using the for loop
        System.out.println("Accessing and printing all elements by iteration using the for loop: ");
        if (!list.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                System.out.println("First element at index " + i + " is " + list.get(i));
            }
        }

        //space break
        System.out.println(" ");

        //accessing and printing:
        // an element using .get (int index)
        // an index by using .indexOf("element_name")
        System.out.println("Using .indexOf to return index at element_name and .get() to return element name at int index: ");
        System.out.println("First element at index " + list.indexOf("Yellow") + " is "+ list.get(1));
        //System.out.println("First element at index " + list.indexOf("Blue") + " is "+ list.get(2));
        //System.out.println("First element at index " + list.indexOf("Purple") + " is "+ list.get(3));
        //System.out.println("First element at index " + list.indexOf("Red") + " is "+ list.get(4));
        //System.out.println("First element at index " + list.indexOf("orange") + " is "+ list.get(5));

        //demonstrating other methods
        System.out.println("\n");
        System.out.println("Number of elements in the list:" + list.size());
        System.out.println("\n");
        System.out.println("A copy of the array list:" + list.clone());//Returns a copy of the array list






    }
}
