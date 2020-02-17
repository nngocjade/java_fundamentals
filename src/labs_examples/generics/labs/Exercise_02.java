package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */



class ReturnSum{
    public static void main(String[] args) {

        ArrayList arrayList = sumCollection(2.5, 4.3, 56.5, 33.4, 44.22);

    }
    // ? - wild card
    public static double sumCollection(ArrayList<? extends Number> nums){//arraylist of any type
        double sum = 0;

        for(int i = 0; i <nums.size(); i++){
            sum += nums.get(i).doubleValue();
        }
        return sum;
    }
}

