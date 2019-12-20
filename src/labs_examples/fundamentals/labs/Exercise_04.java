package labs_examples.fundamentals.labs;

import javax.swing.table.TableCellEditor;
import java.util.Scanner;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r=s.nextDouble();
        System.out.println("Enter the height:");
        double h=s.nextDouble();

        double  volume=((22*r*r*h)/7);

        System.out.println("volume of Cylinder is: " +volume);
    }
}
