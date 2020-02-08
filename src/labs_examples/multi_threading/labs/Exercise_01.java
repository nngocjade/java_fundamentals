package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class Exercise_1{

}
class Runnable1 implements Runnable{

    String threadName;

    Runnable1(String name){
        threadName = name;
    }

    public void run() {
        System.out.println("Starting" + threadName);

    }
}
