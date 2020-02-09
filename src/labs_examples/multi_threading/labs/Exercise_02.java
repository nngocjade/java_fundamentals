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
        Thread threadMultiplyOne = new Thread(multiplyingSimultaneously, "ThreadMultiplyOne");
        //starting thread
        threadMultiplyOne.start();

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
        System.out.println("Starting multiply1");

        //multiply

        int total;
        //as x increments by 1, gets multiplied by y = 2 (every incremented value of x is multiplied by y = 2)
        //x @ 0 times y @ 2 = 0
        // x @ 1 times y @ 2 = 2
        //x @ 2 times y @ 2 = 4
        // and so on..
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