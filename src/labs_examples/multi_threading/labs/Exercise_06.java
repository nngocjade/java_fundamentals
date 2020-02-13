package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

//OddThread to print odd numbers
//Calls printOdd() method of SharedPrinter class until limit is exceeded.
class sharedPrinter {
    //A boolean flag variable to check whether odd number is printed or not
    //Initially it is false.
    boolean isOddPrinted = false;
    //synchronized printOdd() method to print odd numbers. It is executed by OddThread.
    //First checks isOddPrinted,
    //if isOddPrinted is true then it waits until next even number is printed by EvenThread
    //If isOddPrinted is false then prints next odd number, sets isOddPrinted to true
    //sleeps for 1 second before notifying EvenThread
    synchronized void printOdd(int number) {
        while (isOddPrinted) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : "+number);
        isOddPrinted = true;
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
    //Synchronized printEven() method to print even numbers. It is executed by EvenThread.
    //First checks isOddPrinted,
    //if isOddPrinted is false then it waits until next odd number is printed by OddThread
    //If isOddPrinted is true then it prints next even number, sets isOddPrinted to false
    //sleeps for 1 second before notifying OddThread
    synchronized void printEven(int number) {
        while (! isOddPrinted) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : "+number);
        isOddPrinted = false;
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}
class OddThread extends Thread {
    int limit;
    sharedPrinter printer;
    public OddThread(int limit, sharedPrinter printer) {
        this.limit = limit;
        this.printer = printer;
    }
    @Override
    public void run() {
        int oddNumber = 1;        //First odd number is 1
        while (oddNumber <= limit) {
            printer.printOdd(oddNumber);       //Calling printOdd() method of SharedPrinter class
            oddNumber = oddNumber + 2;         //Incrementing to next odd number
        }
    }
}
//EvenThread to print even numbers.
//Calls printEven() method of SharedPrinter class until limit is exceeded.
class EvenThread extends Thread {
    int limit;
    sharedPrinter printer;
    public EvenThread(int limit, sharedPrinter printer) {
        this.limit = limit;
        this.printer = printer;
    }
    @Override
    public void run() {
        int evenNumber = 2;           //First even number is 2
        while (evenNumber <= limit) {
            printer.printEven(evenNumber);          //Calling printEven() method of SharedPrinter class
            evenNumber = evenNumber + 2;           //Incrementing to next even number
        }
    }
}

//Main Class
class Exercise_6{
    public static void main(String[] args){
        sharedPrinter printer = new sharedPrinter();

        OddThread oddThread = new OddThread(100, printer);
        oddThread.setName("Odd-Thread");
        EvenThread evenThread = new EvenThread(100, printer);
        evenThread.setName("Even-Thread");

        oddThread.start();
        evenThread.start();
    }
}