package labs_examples.multi_threading.labs;

import java.io.IOException;
import java.sql.SQLOutput;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_2{
    public static void main(String[] args) {
        System.out.println("Let's multiple simultaneously");

        MultiplyingSimultaneously multiplyingSimultaneously = new MultiplyingSimultaneously(2);
        //passing runnableOne and Thread name of "ThreadOption1"
        Thread threadMultiplyOne = new Thread(multiplyingSimultaneously, "ThreadMultiply1");
        //starting thread
        threadMultiplyOne.start();

        MultiplyingSimultaneously multiplyingSimultaneously1 = new MultiplyingSimultaneously(3);
        //passing runnableOne and Thread name of "ThreadOption1"
        Thread threadMultiplyTwo = new Thread(multiplyingSimultaneously1, "ThreadMultiply2");
        //starting thread
        threadMultiplyTwo.start();


    }
}
//POJO
class MultiplyingSimultaneously implements Runnable{

    private int y;

    public MultiplyingSimultaneously(int y) {
        this.y = y;
    }

    @Override
    public void run() {
        System.out.println("Starting " + Thread.currentThread().getName());

        //multiply

        int total;
        //as x increments by 1, gets multiplied by y (in other words, every incremented value of x is multiplied by y)
        for(int x=0; x<20; x++){
            try{
                total = x*y;
                System.out.println("In " + Thread.currentThread().getName() + " total = " + total);
            }catch (Exception e){
                System.out.println("error detected");
            }

        }
    }
}