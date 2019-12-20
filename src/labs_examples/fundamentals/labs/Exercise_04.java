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
    private static Scanner sc;
    public static void main(String[] args) {
            double radius, height;
            sc = new Scanner(System.in);

            System.out.println("\n Please Enter the radius of a Cylinder : ");
            radius = sc.nextDouble();
            System.out.println("\n Please Enter the Height of a Cylinder : ");
            height = sc.nextDouble();
            VolumeOfCylinder(radius, height);
    }
}
