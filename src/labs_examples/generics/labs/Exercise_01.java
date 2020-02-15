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
    private T height;

    public GenericsEx(T age, T height) {
        this.age = age;
        this.height = height;
    }

    public GenericsEx(T firstName, T lastName, T age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public GenericsEx(T firstName, T lastName, T age, T height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
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

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }
}

class Exercise_1{
    public static void main(String[] args) {
        GenericsEx genericsExStringIntDouble = new GenericsEx("Ngoc Jade", "Nguyen", 25, 154.5);
        GenericsEx genericsExString = new GenericsEx("Ngoc Jade", "Nguyen", "twenty-five");
        GenericsEx genericsExIntString = new GenericsEx(25.5, "one hundred fifty four and a half centimeters");
    }
        }

