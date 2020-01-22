package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Exercise_4{
    public static void main(String[] args) {

        int[] list = {33,21,22,55,44};

        try{//Outer block exception
            int z = list[5];
            System.out.println(z);
        }catch(Exception e){
            try{//inner block exception
                int x = list[0] / list[18];
                //int x = list[0] / list[10];//inner block error
            }catch (IndexOutOfBoundsException aeExc){
                System.out.println("Inner block error: Index out of bound");
            }
            System.out.println("Outer block error detected");
        }
        System.out.println("End of program");
    }

}