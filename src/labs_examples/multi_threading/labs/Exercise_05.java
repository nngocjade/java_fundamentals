package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

//alarm goes off
class Alarm {
    private int hour;
    private String state;

    //true (wakeUp) if t = (specified hour) should wait
    //false (sleep) if t != (specified hour) should wait
    private Boolean ring = true;

    synchronized void wakeUp(int hour) {
        state = "wake up";
        this.hour = hour;

        while (ring) {
            for (int t = 1; t < 24; t++) {  //24 hr time
                try {
                    t = hour;
                    if (t <= 5) {
                        System.out.println("Alarm goes off when: hour = " + t + ". Time to " + state);
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

    synchronized void sleep(int hour) {
        this.hour = hour;
        state = "sleeping";

        while (!ring) {
            for (int t = 1; t < 24; t++) {
                try {
                    t = hour;
                    if (t <= 24) {
                        System.out.println("Continue" + state + " when t = " + t);
                        wait(1);
                        return;
                    }
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        ring = false;
        notify();
    }

    //Thread
    static class SyncThreadAlarmClock implements Runnable {

        Thread thread;
        Alarm alarmWakeUp = new Alarm();
        int hr;

        public SyncThreadAlarmClock(int hour, String name) {
            thread = new Thread(this, name);
            hr = hour;
            thread.start();
        }
        @Override
        public void run() {
            System.out.println("Starting " + Thread.currentThread().getName());
            alarmWakeUp.wakeUp(hr);
            alarmWakeUp.sleep(hr);
        }
    }

    //controller
    static class Exercise_5 {
        public static void main(String[] args) {
            System.out.println("Main thread starting");

            SyncThreadAlarmClock syncThreadAlarmClock = new SyncThreadAlarmClock(5, "synThread1");
            SyncThreadAlarmClock syncThreadAlarmClock2 = new SyncThreadAlarmClock(9, "synThread2");

            try {
                System.out.println("starting join thread");
                syncThreadAlarmClock.thread.join();
                syncThreadAlarmClock2.thread.join();
                System.out.println("join complete");
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
