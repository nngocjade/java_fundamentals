package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create a new class called MethodTraining.java and in this class please do the following:
 *     1) Demonstrate method overloading in this class
 *     2) Demonstrate the difference between "pass by value" and "pass by reference"
 *     3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
 *     4) Write a method to count all consonants (the opposite of vowels) in a String
 *     5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
 *     6) Write a method that will determine whether or not a number is prime
 *     7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
 *             which is passed in as an argument
 *     8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
 *         In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
 *         divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
 *         length of the returned list
 *     9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
 *         instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
 *         variable is used to temporarily store individual values in the array
 */
public class Exercise_3 {
    //demo method overloading
    public static void main(String[] args){

        //invoke varargs
        int largest = varargs(2,4,33,55,3,1);
        //invoke consonants
        String consonantLength = consonants("green");
        //invoke ascii art
        int lines = AsciiArt(6);
        //invoke HighestLowest
        Pair highLow = HighestLowest(4,5,2,9,12,55,45,32);
        //invoke primeOrNot
        boolean pOrNot = (boolean) primeOrNot(12);
        //invoke ArrayList

        ArrayList aList = getDivisibleNums(6,1,2 );
        System.out.println("The length of the array list divisible num is: " + aList.size());
        //invoke reverseArray
        int [] a = {12, 43, 32, 77, 31, 11, 44, 66};
        int [] revArray = ReverseArray(a);


        //print varargs
        System.out.print("Largest value: " + largest);
        //print consonant
        System.out.println("\n" + "Number of consonants: " + consonantLength);
        //print Ascii Art
        System.out.println(lines);
        //print Highest Lowest
        //System.out.println(highLow);
        System.out.println("Highest value: " + highLow.high);
        System.out.println("Lowest value: " + highLow.low);
        //print prime or not
        System.out.println("If prime, return true, otherwise, false: " + pOrNot);
        //print Arraylist
        System.out.println("The array list is divisible by divisor 1 and divisor 2: " + aList);
        //print reverseArray
        System.out.println("Array in reversed order: " + Arrays.toString(revArray));

    }
    //Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    //not using static here because it is under the same class as controller
    public static int varargs(int...array){
        int largest = array[0];
        for(int i =1; i<array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
    //Write a method to count all consonants (the opposite of vowels) in a String
    public static String consonants(String word) {
        String consonants = "bcdfghjklmnpqrstvwxz";
        int consCount = 0;
        for (int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(consonants.indexOf(ch) >= 0){
                consCount++;
            }
        }
        return String.valueOf(consCount);
    }
    //Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
    public static int AsciiArt(int n) {
        int i, j, k, l;
        for(i=0;i<n;i++) {
            for(k=0;k<i;k++) {
                System.out.print("!`*``");
            }
            for(l=0;l<2*n-1-2*i;l++) {
                System.out.print("+*+*+");
            }
            for(k=0;k<i;k++) {
                System.out.print("``*`!");
            }
            //on each line
            System.out.println();
        }
        return n;
        }
    //Write a method that will determine whether or not a number is prime
    public static Object primeOrNot(int num) {
            //prime numbers are only divisible by 1 and itself,
            // so num cannot be less than 1, if so, it would be false
            // Check from 2 to num-1
            for (int i = 2; i < num-1; i++) {

                if (num % i == 0) {//This reads: If the number divided by 2 has a remainder of 0
                    return false;
                }
            }
            return true;
    }

    //Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    // *             which is passed in as an argument
    static Pair HighestLowest( int...array) {

        Pair highLow = new Pair();
        int i;

        if (array[0] > array[1]){
            highLow.high = array[0];
            highLow.low = array[1];
        }
        else {
            highLow.high = array[1];
            highLow.low = array[0];
        }
        for (i = 2; i < array.length; i++) {
            if (array[i] > highLow.high) {
                highLow.high = array[i];
            } else if (array[i] < highLow.low) {
                highLow.low = array[i];
            }
        }
        return highLow;
    }
    //Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    // *         In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    // *         divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    // *         length of the returned list
    public static ArrayList getDivisibleNums(int maxNum, int divisor1, int divisor2) {

        ArrayList<Integer> divisibleNums = new ArrayList();

        int x = 1;
        for (int i = 0; i <= maxNum; i++){
           if (x % divisor1 == 0 && x % divisor2 == 0){
               divisibleNums.add(x);
           }
           x++;
        }
        return divisibleNums;
    }
    //Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    // *         instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    // *         variable is used to temporarily store individual values in the array
    public static int[] ReverseArray(int... array) {

        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}

class Pair{
    int low;
    int high;
}


