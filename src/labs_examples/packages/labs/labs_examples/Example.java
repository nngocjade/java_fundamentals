package labs_examples.packages.labs.labs_examples;

import labs_examples.packages.labs.labs_examples1.Example1;

public class Example {
    public static void main(String[] args) {
        //calling divide method from the same package and class
        System.out.println("calling divide method from the same package and class: " + divide(6,2));
        System.out.println("cannot call multiply method from another package because the multiply method has protected access" +
                " meaning it can only be accessed by members within the same package.");
        //calling protected multiply method from another package

        //Example1.multiply(4,5);

        //cannot call the multiply method because it has a protected access
        // - meaning it can only be accessed by members within the same package
    }
    public static int divide(int a, int b){
        return a/b;
    }
}
