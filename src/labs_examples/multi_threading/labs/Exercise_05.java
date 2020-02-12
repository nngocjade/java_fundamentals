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
        state = "wake up";

        for (int t = 1; t < 24; t++){
            try{
                t = hour;
                if(t <= 24){
                    System.out.println("Alarm goes off when: t = " + t + " " + state);
                    wait();
                }
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }

    synchronized void sleep()

}
//Thread
class SyncThreadAlarmClock implements Runnable{

    Thread thread;
    static AlarmWakeUp alarmWakeUp = new AlarmWakeUp(hour);
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
    }
}

//controller
class Exercise_5{
    public static void main(String[] args) {
        System.out.println("Main thread starting");

        SyncThreadAlarmClock syncThreadAlarmClock = new SyncThreadAlarmClock(4, "synThread1");


    }
}
