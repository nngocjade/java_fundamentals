package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer: Due to the order of execution, the static blocks are executed first,
 *             followed by constructors and then the instance methods (a non-static method of a class).
 *
 *             But in an inheritance relationship, the order of execution of constructors is
 *             parent class to child class.
 *
 *             In this case, although, the main method (which has a static keyword) should print first
 *             but it is invoking the constructor in subclass C_1
 *             therefore, the order of execution of constructors in inheritance relationship kicks in.
 *             So, the parent class A_1 prints first, then following subclass B_1, lastly subclass C_1.
 *
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
