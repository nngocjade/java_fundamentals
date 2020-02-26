package labs_examples.lambdas.labs;

import labs_examples.generics.labs.Exercise_03;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class Exercise_3 {
    public static void main(String[] args) {

       Num n = DNum::dNumToIntNum;
       n.num();


    }
}
interface Num{
    void num();
}
class DNum {

    public static void dNumToIntNum () {
        double d1 = 10;
        double d2 = 12;
        int x = (int) (d1 * d2);
        System.out.println(x);
    }
}
