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


        ArrayList<Double> doubleList = new ArrayList<>();
        Double[] doubles = { 5.5, 4.4, 6.6, 7.7, 8.8, 9.9 };

        for (Double element : doubles)
            doubleList.add(element);

        System.out.printf("doubleList contains: %s\n", doubleList);
        System.out.printf("Total of the elements in doubleList: %.1f\n\n", sumCollection(doubleList));
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

