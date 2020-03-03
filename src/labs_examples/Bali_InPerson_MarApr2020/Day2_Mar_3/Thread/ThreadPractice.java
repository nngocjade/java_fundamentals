package labs_examples.Bali_InPerson_MarApr2020.Day2_Mar_3.Thread;

/*
Create at least 3 classes that extend Thread and each must do something a little different - then show how to start these threads from another class
Create at least 3 classes that implment Runnable - demonstrate the two ways we can start a Runnable (one in the constructor, and one not in the constructor) - then show how to start these Runnable threads from another class
 */

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {

        Thread1 thread1 = new Thread1("thread1", 5,3);
        Thread2 thread2 = new Thread2("thread2", "It is hot here in Bali");
        Thread3 thread3 = new Thread3("thread3", false);

        Thread1.sleep(100);
        Thread2.sleep(4);
        Thread3.sleep(1000);

        Runnable1 runnable1 = new Runnable1();
        runnable1.Multiply(5,"Runnable1");



    }
}

class Thread1 extends Thread{
    private int x;
    private int y;

    public Thread1(String name, int x, int y) {
        super(name);
        start();
        setPriority(10);
        this.x = x;
        this.y = y;

        int z = x*y;
        System.out.println(z);
    }
}

class Thread2 extends Thread{
    private String s;

    public Thread2(String name, String s) {
        super(name);
        start();
        this.s = s;

        System.out.println(s);

    }
}

class Thread3 extends Thread{
    private boolean t;

    public Thread3(String name, boolean t) {
        super(name);
        start();
        this.t = t;

        if (t == true){
            System.out.println("You're right");
        }else {
            System.out.println("You're wrong");
        }
    }

}

class Runnable1 implements Runnable{

    //multiplying by y
    private int y;
    //creating thread object that will manage the thread
    Thread thread;

    public void Multiply(int y, String name) {
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

class Runnable2 implements Runnable{

    @Override
    public void run() {

    }
}

class Runnable3 implements Runnable{

    @Override
    public void run() {

    }
}