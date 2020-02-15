package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class GenericsEx<T> {
    private T firstName;
    private T lastName;
    private T age;

    public GenericsEx(T firstName, T lastName, T age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getLastName() {
        return lastName;
    }

    public void setLastName(T lastName) {
        this.lastName = lastName;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}

class Exercise_1{
    public static void main(String[] args) {
        GenericsEx genericsExStringAndInt = new GenericsEx("Ngoc Jade", "Nguyen", 25);
        GenericsEx genericsExString = new GenericsEx("Ngoc Jade", "Nguyen", "twenty-five");


    }
        }

