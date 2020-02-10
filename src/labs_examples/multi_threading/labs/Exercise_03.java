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
        MultiplyingSimultaneously multiplyingSimultaneously = new MultiplyingSimultaneously(2, "ThreadMultiply2");
        MultiplyingSimultaneously multiplyingSimultaneously1 = new MultiplyingSimultaneously(3, "ThreadMultiply3");

    }
}
