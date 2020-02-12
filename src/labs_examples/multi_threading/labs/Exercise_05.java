package labs_examples.multi_threading.labs;

import java.util.Scanner;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

//alarm goes off
class AlarmWakeUp{
    private Scanner hour;
    private String state;

    synchronized void userInput(Scanner hour){
        this.hour = hour;
        System.out.println("Enter a number between 1 and 24: ");
        Scanner scanner = new Scanner(System.in);
        scanner = hour.reset();
    }

    synchronized void ring(){

        state = "wake up";

        for (int t = 1; t < 24; t++){
            try{
                if(t <= 24){
                    System.out.println("Alarm goes off when: t = " + t + " " + state);
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
    public static Scanner hour;
    Thread thread;
    static AlarmWakeUp alarmWakeUp = new AlarmWakeUp();
    int alarmRing;

    public SyncThreadAlarmClock ( String name){
        thread = new Thread(this, name);

        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + Thread.currentThread().getName());

        alarmWakeUp.userInput(hour);


    }
}

//controller
class Exercise_5{
    public static void main(String[] args) {
        System.out.println("Main thread starting");



        SyncThreadAlarmClock syncThreadAlarmClock = new SyncThreadAlarmClock( "synThread1");


    }
}
