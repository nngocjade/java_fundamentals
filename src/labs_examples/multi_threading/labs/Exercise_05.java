package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

//alarm goes off
class AlarmClock{
    private int hour;

    synchronized void ring(int hour){
        this.hour = hour;

        for (int t = 1; t < 24; t++){
            if(t == 5){
                System.out.println("Alarm goes off when: t = " + t);
            }
        }
    }

}

//controller
class Exercise_5{
    public static void main(String[] args) {

    }
}
