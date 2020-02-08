package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class Exercise_1{
    public static void main(String[] args) {
        System.out.println("Printing and Starting with Main thread");
        //Option 1
        //Creating runnable object
        Runnable1 runnableOne = new Runnable1();
        //passing runnableOne and Thread name of "ThreadOption1"
        Thread threadOne = new Thread(runnableOne, "ThreadOption1");
        //starting thread
        threadOne.start();

        //Option 2
        //Create the Thread, passing Runnable1 on the fly in constructor, and Thread name
        Thread threadTwo = new Thread(new Runnable1(), "ThreadOption2");
        //starting thread
        threadTwo.start();

        //Option 3
        //All in one line: creating Thread and runnable on the fly, passing in name and starting
        new Thread(new Runnable1(), "ThreadOption3").start();
        System.out.println("end of main thread");

    }

}
class Runnable1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Starting " + Thread.currentThread().getName());

        for(int count=0; count<5; count++){
            try {
                Thread.sleep(1000);
                System.out.println("In " + Thread.currentThread().getName() + " count is " + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
