package labs_examples.objects_classes_methods.labs.methods;

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
    public static void main(String[] args) {

        //invoke varargs
        int largest = varargs(2,4,33,55,3,1);
        //invoke consonants
        String consonantLength = consonants("green");
        //invoke HighestLowest
        Pair highLow = HighestLowest(4,5,2,9,12,55,45,32);


        //print varargs
        System.out.print("Largest value: " + largest);
        //print consonant
        System.out.println("\n" + "Number of consonants: " + consonantLength);
        //print Highest Lowest
        //System.out.println(highLow);
        System.out.println("Highest value: " + highLow.high);
        System.out.println("Lowest value: " + highLow.low);
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
    public void printAscii(String[] args) {








    }
    //Write a method that will determine whether or not a number is prime
    public static boolean primeOrNot(int num) {

        //prime numbers are only divisible by 1 and itself
            if (num <= 1)
                return false;

            // Check from 2 to n-1
            for (int i = 2; i < num; i++)
                if (num % i == 0)
                    return false;
            return true;
        }

    //Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    // *             which is passed in as an argument
    //TODO Ask Ryan about this
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
    public static void Arraylist(String[] args) {









    }
    //Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    // *         instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    // *         variable is used to temporarily store individual values in the array
    public static void ReverseArray(String[] args) {









    }
}

class Pair{
    int low;
    int high;
}

