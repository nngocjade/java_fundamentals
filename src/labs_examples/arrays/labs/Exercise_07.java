package labs_examples.arrays.labs;
import java.util.ArrayList;
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

        //populating the list created
        for (String element : list){
            System.out.println(element);
        }

        //access element within the array list

        //demonstrating other methods

    }
}
