package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
class Exercise_7{
    public static void main(String[] args) throws SalonFullException {
       try{
           addCustomerToSalon();
       }catch (SalonFullException e){
           System.out.println(e.toString());
       }
    }
    public static void addCustomerToSalon() throws SalonFullException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, how can I help you?");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("I would like to get in please")){
            throw new SalonFullException();

        }
        System.out.println("Would you like to come back at another time?");
        String response1 = scanner.next();

        System.out.println("Great! You are schedule!");
    }

}

class SalonFullException extends Exception{
    @Override
    public String toString() {
        return "SalonFullException{Sorry, we are currently full}";
    }
}