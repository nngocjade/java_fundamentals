package labs_examples.packages.labs.labs_examples;

import labs_examples.packages.labs.labs_examples1.Example1;

public class Example {
    public static void main(String[] args) {
        //
        //calling protected multiply method from another class
        //Example1.multiply(4,5);
        //cannot call the multiply method because it has a protected access
        // - meaning it can only be accessed by members of the same class.
        System.out.println(divide(3,2));
    }
    public static int divide(int a, int b){
        return a*b;
    }
}
