package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            System.out.println("outer loop i = " + i);
            if(i <= 10){
                if (i == 5){
                    System.out.println("inner inner loop i = " + i);
                    continue;
                }
                else if (i >= 6){
                    System.out.println("inner inner other loop i = " + i);
                }
            }
        }
    }
}
