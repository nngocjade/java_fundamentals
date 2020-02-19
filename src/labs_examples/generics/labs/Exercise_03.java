package labs_examples.generics.labs;


import java.util.*;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a collection of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 *      5)
 */

public class Exercise_03 {
    public static void main(String[] args) {
        //1
        System.out.println(add(4.5,5.6));
        System.out.println("");

        //2
        Exercise_03 obj = new Exercise_03();
        // Declaring arraylist without any initial size
        ArrayList<String> arrayli = new ArrayList<String>();

        // Appending elements at the end of the list
        arrayli.add(new String("madam"));
        arrayli.add(new String("bob"));
        arrayli.add(new String("green"));
        arrayli.add(new String("hannah"));
        System.out.print("Elements before reversing:");
        obj.printElements(arrayli);
        arrayli = obj.reverseArrayList(arrayli);
        System.out.print("\nElements after reversing:");
        obj.printElements(arrayli);

    //3
        System.out.println("");
        ArrayList<String> list = new ArrayList<String>();
        list.add("The");
        list.add("dog");
        list.add("is");
        list.add("happy");
        Collections.swap(list, 1, 2);
        System.out.println(list);
        //4
        System.out.println("");
        List<Integer> c = Arrays.asList(1, 2, 55, 4, 9, 6, 12, 8, 11, 20);
        System.out.println(maximalElement(c, 1, 10));

    }

//     1) Write a generic method that accepts two generic arguments. This generic method should only accept
//     arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
//     numbers were passed in regardless of their type.
    public static<T extends Number> T add(T x, T y){
    Double sum;
    sum = x.doubleValue() + y.doubleValue();
    return (T) sum;
}

//     2) Write a generic method to count the number of elements in a collection of Strings that are palindromes
    public ArrayList<String> reverseArrayList(ArrayList<String> alist) {
        // Arraylist for storing reversed elements
        ArrayList<String> revArrayList = new ArrayList<String>();
        for (int i = alist.size() - 1; i >= 0; i--) {
        // Append the elements in reverse order
        revArrayList.add(alist.get(i));}
        // Return the reversed arraylist
        return revArrayList;
    }
        // Iterate through all the elements and print
        public void printElements(ArrayList<String> alist) {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }

//     3) Write a generic method to exchange the positions of two different elements in an array.

    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

//     4) Write a generic method to find the largest element within the range (begin, end) of a list.
    public static <T extends Comparable> T maximalElement (List<T> list, int begin, int end) {
    T max = list.get(begin);
    for (int i = begin + 1; i < end; i++) {
        T elem1 = list.get(i);
        if (elem1.compareTo(max) > 0) {
            max = elem1;
        }
    }
    return max;
}
}

