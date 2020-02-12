package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

//alarm goes off
class AlarmWakeUp{
    private int hour;
    private String state;

    AlarmWakeUp() {
    }

    synchronized void ring(int hour){
        this.hour = hour;

        for (int t = 1; t < 24; t++){
            try{
                t = hour;
                if(t <= 24){
                    System.out.println("Alarm goes off when: hour = " + t );
                    wait(1);
                    return;
                }
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }

    synchronized void wakeUp() {
        state = "wake up";

        try{
            System.out.println("Time to " + state);
            notify();
            wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
//Thread
class SyncThreadAlarmClock implements Runnable{

    Thread thread;
    static AlarmWakeUp alarmWakeUp = new AlarmWakeUp();
    int hr;


    public SyncThreadAlarmClock (int hour, String name){
        thread = new Thread(this, name);
        hr = hour;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + Thread.currentThread().getName());

        alarmWakeUp.ring(hr);

        alarmWakeUp.wakeUp();

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
