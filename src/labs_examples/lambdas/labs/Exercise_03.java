package labs_examples.lambdas.labs;

import labs_examples.generics.labs.Exercise_03;

import java.util.function.DoubleToIntFunction;

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
        //method reference
        //example 1 - double to int
       Num n = DNum::dNumToIntNum;
       n.num(12.34, 23.45);
        //example 2 - double to int using Functional Interface
       DoubleToIntFunction d = DNum1::dNumToIntNum1;

       //Predicate Method Reference



    }
}
interface Num{
    void num(double d1, double d2);
}
class DNum {
    public static void dNumToIntNum (double d1, double d2) {
        int x = (int) (d1 * d2);
        System.out.println(x);
    }
}

class DNum1{
    public static int dNumToIntNum1 (double value){
       int x = (int) (value*2);
       return x;
    }
}
