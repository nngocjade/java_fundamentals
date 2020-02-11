package labs_examples.multi_threading.labs;



/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
//POJO1
class MultiplySyncBlock {
    private int y;

    int MultiplySyncBlock(int y) {
        this.y = y;

        //multiply
        int total = 0;
        //as x increments by 1, gets multiplied by y (in other words, every incremented value of x is multiplied by y)
        for (int x=0; x<20; x++){
            try {
                    total = x * y;
                System.out.println("In " + Thread.currentThread().getName() + " total = " + total);
            } catch (Exception e){
                System.out.println("error detected");
            }
        }return total;
    }
}
//POJO2

class MultiplySyncMethod {
    private int z;
    private int a;

    synchronized int MultiplySyncMethod(int z, int a) {
            this.z = z;
            this.a = a;
            //multiply
            int total = 0;
            //as x increments by 1, gets multiplied by y (in other words, every incremented value of x is multiplied by y)
            for (int x=0; x<10; x++){
                try {
                    total = x * z * a;
                    System.out.println("In " + Thread.currentThread().getName() + " total = " + total);
                } catch (Exception e){
                    System.out.println("error detected");
                }
            }return total;
        }
}
//Thread
class SyncThread implements Runnable{

    //creating thread object that will manage the thread
    Thread thread;

    static MultiplySyncBlock mB = new MultiplySyncBlock();
    static MultiplySyncMethod mM = new MultiplySyncMethod();
    int mY;
    int mZ;
    int mA;
    int answer;

    public SyncThread(int y, String name) {
        //create thread object - pass "this" object and the name given
        thread = new Thread(this, name);
        mY = y;
        //start the thread automatically when the MultiplyingSimultaneously object is created
        thread.start();
    }

    public SyncThread(int z, int a, String name) {
        //create thread object - pass "this" object and the name given
        thread = new Thread(this, name);
        mZ = z;
        mA = a;
        //start the thread automatically when the MultiplyingSimultaneously object is created
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + Thread.currentThread().getName());

        //synchronized block
        synchronized(mB) {
            answer = mB.MultiplySyncBlock(mY);
        }
        //synchronized method
        answer = mM.MultiplySyncMethod(mZ,mA);
    }
}
//controller
class Exercise_4{
    public static void main(String[] args) {
        System.out.println("Let's multiple simultaneously");

        SyncThread syncThread1 = new SyncThread(1, "ThreadMultiplySync1");
        SyncThread syncThread2 = new SyncThread(2, "ThreadMultiplySync2");
        SyncThread syncThread3 = new SyncThread(3,3, "ThreadMultiplySync3");
        SyncThread syncThread4 = new SyncThread(4, 4, "ThreadMultiplySync4");

        try {
            syncThread1.thread.join();
            syncThread2.thread.join();
            syncThread3.thread.join();
            syncThread4.thread.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}