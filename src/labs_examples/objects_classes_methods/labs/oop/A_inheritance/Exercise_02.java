package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: i = 20 is printed - because object B, with the name " a" , is being called from the controller method.
 * Object B, in this case, is sub-class B. Meanwhile, B inherited i from superclass A, int i now has a new value of 20.
 * So, when B is being called upon will return 20.
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        B a = new B();

        System.out.println(a.i);
    }
}