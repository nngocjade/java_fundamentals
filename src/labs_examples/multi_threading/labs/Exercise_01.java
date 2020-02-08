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
        Runnable1 runnable1 = new Runnable1();


        //Option 2
    }

}
class Runnable1 implements Runnable{

    String threadName;
    Runnable1(String name){
        threadName = name;
    }

    public Runnable1() {

    }

    public void run() {
        System.out.println("Starting" + threadName);

        for(int count=0; count<5; count++){
            try {
                Thread.sleep(1000);
                System.out.println("In" + threadName + "count is" + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
