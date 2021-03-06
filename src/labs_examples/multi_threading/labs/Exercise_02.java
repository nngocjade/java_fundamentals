package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_2{
    public static void main(String[] args) {
        System.out.println("Let's multiple in parallel");

        SyncThread multiplyingSimultaneously = new SyncThread(2, "ThreadMultiply2");
        SyncThread multiplyingSimultaneously1 = new SyncThread(3, "ThreadMultiply3");

        Multiply multiply1 = new Multiply(2, "Thread1");
        Multiply multiply2 = new Multiply(4, "Thread2");

    }
}
//POJO implementing thread
class Multiply implements Runnable{

    //multiplying by y
    private int y;
    //creating thread object that will manage the thread
    Thread thread;

    public Multiply(int y, String name) {
        //passing in value for y in the main thread
        this.y = y;
        //create thread object - pass "this" object and the name given
        thread = new Thread(this, name);
        //start the thread automatically when the MultiplyingSimultaneously object is created
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + Thread.currentThread().getName());

        //multiply
        int total;
        //as x increments by 1, gets multiplied by y (in other words, every incremented value of x is multiplied by y)
        for (int x=0; x<20; x++){
            try {
                total = x*y;
                System.out.println("In " + Thread.currentThread().getName() + " total = " + total);
            } catch (Exception e){
                System.out.println("error detected");
            }
        }
    }
}