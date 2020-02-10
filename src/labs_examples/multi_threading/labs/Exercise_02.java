package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_2{
    public static void main(String[] args) {
        System.out.println("Let's multiple simultaneously");

        MultiplyingSimultaneously multiplyingSimultaneously = new MultiplyingSimultaneously(2, "ThreadMultiply2");
        MultiplyingSimultaneously multiplyingSimultaneously1 = new MultiplyingSimultaneously(3, "ThreadMultiply3");

    }
}
//POJO implementing thread
class MultiplyingSimultaneously implements Runnable{

    private int y;
    Thread thread;

    public MultiplyingSimultaneously(int y, String name) {
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