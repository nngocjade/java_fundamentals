package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Exercise_4 {
    public static void main(String[] args)
    {
        Parent c = new Child();
        c.doSomething();
        double pi = Math.PI;
    }
}

class Parent
{
    public void doSomething()
    {
        System.err.println("Parent called");
    }
}

class Child extends Parent
{
//    //public void doSomething()
//    {
//        System.err.println("Child called");
//    }
}
