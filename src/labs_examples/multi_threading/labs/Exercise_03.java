package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

class Exercise_3{
    public static void main(String[] args) {
        System.out.println("Let's multiple simultaneously");

        //prioritizing threads in Exercise 2
        MultiplyingSimultaneously multiplyingSimultaneously = new MultiplyingSimultaneously(2);
        //passing runnableOne and Thread name of "ThreadOption1"
        Thread threadMultiplyOne = new Thread(multiplyingSimultaneously, "ThreadMultiply1");
        //starting thread
        threadMultiplyOne.start();

        MultiplyingSimultaneously multiplyingSimultaneously1 = new MultiplyingSimultaneously(3);
        //passing runnableOne and Thread name of "ThreadOption1"
        Thread threadMultiplyTwo = new Thread(multiplyingSimultaneously1, "ThreadMultiply2");
        //starting thread
        threadMultiplyTwo.start();


    }
}
