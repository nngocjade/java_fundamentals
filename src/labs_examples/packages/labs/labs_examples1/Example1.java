package labs_examples.packages.labs.labs_examples1;

import labs_examples.packages.labs.labs_examples.Example;

public class Example1 {
    public static void main(String[] args) {

        //calling multiply method from the same package and class
        Example1 m = new Example1();
        System.out.println("calling multiply method from the same package and class: "+ m.multiply(3,5));

        //calling divide method from another package
        int divide = Example.divide(18,2);
        System.out.println("calling divide method from another package: " + divide);
    }
    protected int multiply(int x, int y) {
        return x*y;
    }
}
