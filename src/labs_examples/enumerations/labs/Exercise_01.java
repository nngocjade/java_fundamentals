package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

class Exercise_1{

    public static void main(String[] args) {

    }
}

enum MoodStatus {
        HAPPY ("feeling full of joy"),
        SAD ("feeling like poop"),
        MAD ("raging in anger"),
        EXITED ("feeling on top of the world");

    MoodStatus(String s) {
    }
}


