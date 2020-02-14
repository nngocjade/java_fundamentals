package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

//alarm goes off
class Alarm{
    private int hour;
    private String state;
    private

    //true (wakeUp) if t = (specified hour) should wait
    //false (sleep) if t != (specified hour) should wait
    private Boolean ring = true;

    synchronized void wakeUp(int hour){
        state = "wake up";
        this.hour = hour;

        while(ring) {
            for (int t = 1; t < 24; t++) {  //24 hr time
                try {
                    t = hour;
                    if (t <= 24) {
                        System.out.println("Alarm goes off when: hour = " + t);
                        System.out.println("Time to " + state);
                        wait(1);
                        return;
                    }
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        ring = true;
        notify();
    }

    synchronized void sleep(int ) {

        while(!ring) {
            for (int t = 1; t < 24; t++) {
                try {
                    t = hour;
                    if (t <= 24) {
                        System.out.println("Continue sleeping with t = " + t);
                        wait(1);
                        return;
                    }
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        ring = false;
        notifyAll();
}
//Thread
class SyncThreadAlarmClock implements Runnable{

    Thread thread;
    static Alarm alarmWakeUp = new Alarm();
    int hr;


    public SyncThreadAlarmClock (int hour, String name){
        thread = new Thread(this, name);
        hr = hour;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + Thread.currentThread().getName());

        alarmWakeUp.wakeUp(hr);

        alarmWakeUp.sleep();

    }
}

//controller
class Exercise_5{
    public static void main(String[] args) {
        System.out.println("Main thread starting");

        SyncThreadAlarmClock syncThreadAlarmClock = new SyncThreadAlarmClock(4, "synThread1");

        try {
            syncThreadAlarmClock.thread.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

    }
}
