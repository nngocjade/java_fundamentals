package labs_examples.multi_threading.labs;

import java.sql.SQLOutput;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_2{
    public static void main(String[] args) {
        System.out.println("Let's multiple simultaneously");

    }
}
//POJO
class Culture implements Runnable{

    @Override
    public void run() {
        System.out.println("");
    }
}