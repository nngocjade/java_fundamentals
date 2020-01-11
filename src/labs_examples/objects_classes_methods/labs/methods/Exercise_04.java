package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creatin the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {
        int x = factorial(5);//5 will get passed in first, then 4, 3, 2, 1 until it knows what x equals,
        //in this case, x = 1, 1! = 1, so then it continues to loop back around, 2*1! -> 3*2! -> 4*3! -> 5*4! -> 5! = 120
        System.out.println(x);
    }
    // 1 * 2 * 3 * 4 * 5 = 120
    static int factorial(int x){
        int total;

        //base case - this will be used to end the recursive calls
        if(x == 1)
            return 1;

        //other wise, factorial is called and passed x -1,
        //reducing x each time until it reaches 1.
        total = x * factorial(x - 1);

        return total;
    }
}
/*
    2*1! -> 2 * 1 = 2
    3*2! -> 3 * 2 = 6
    4*3! -> 4 * 6 = 24
    5*4! -> 5 * 24 = 120
    5!    =120       (oldest, first to be in the stack)

 */

