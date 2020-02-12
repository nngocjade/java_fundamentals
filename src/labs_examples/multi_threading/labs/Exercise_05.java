package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

//alarm goes off
class AlarmWakeUp{
    private int hour;
    String state;

    synchronized void ring(int hour){
        this.hour = hour;
        state = "wake up";

        for (int t = 1; t < 24; t++){
            try{
                t = hour;
                if(t <= 24){
                    System.out.println("Alarm goes off when: t = " + t + state);
                    wait();
                }
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }

        }

    }

}
//Thread
class SyncThreadAlarmClock implements Runnable{
    Thread thread;
    AlarmWakeUp alarmWakeUp;

    @Override
    public void run() {

    }
}

//controller
class Exercise_5{
    public static void main(String[] args) {

    }
}
