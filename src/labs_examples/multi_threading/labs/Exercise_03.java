package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

//using Exercise 2 to demo changing priority
class Exercise_3{
    public static void main(String[] args) throws Exception {
        System.out.println("Let's multiple simultaneously");


        MultiplySetPriority multiplyingSimultaneously = new MultiplySetPriority(2, "ThreadMultiply2");
        MultiplySetPriority multiplyingSimultaneously1 = new MultiplySetPriority(3, "ThreadMultiply3");

        //thread priority
        multiplyingSimultaneously.thread.setPriority(Thread.NORM_PRIORITY+2);
        multiplyingSimultaneously1.thread.setPriority(Thread.NORM_PRIORITY-2);


        try {
            multiplyingSimultaneously.thread.join();
            multiplyingSimultaneously1.thread.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("\nHigh priority thread counted to " +
                multiplyingSimultaneously.count);
        System.out.println("Low priority thread counted to " +
                multiplyingSimultaneously1.count);
    }

    }



class MultiplySetPriority implements Runnable{
    int count;
    //multiplying by y
    private int y;
    //creating thread object that will manage the thread
    Thread thread;
    static boolean stop = false;
    static String currentName;
    int id = 0;

    public MultiplySetPriority(int y, String name) {
        //passing in value for y in the main thread
        this.y = y;
        //create thread object - pass "this" object and the name given
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
        //start the thread automatically when the MultiplyingSimultaneously object is created
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + Thread.currentThread().getName());


        do {
            count++;
            if(currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                //multiply
                int total;
                //as x increments by 1, gets multiplied by y (in other words, every incremented value of x is multiplied by y)
                for (int x = 0; x < 20; x++){
                    try {
                        total = x * y;
                        System.out.println("In " + Thread.currentThread().getName() + " total = " + total);
                    } catch (Exception e){
                        System.out.println("error detected");
                    }
                }
            }
        } while(stop == false && count < 20);
        stop = true;
    }
}
