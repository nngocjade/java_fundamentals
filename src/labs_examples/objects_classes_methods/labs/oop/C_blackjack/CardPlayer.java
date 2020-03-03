package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class CardPlayer {

    private String name;
    private int stackValue;

    public CardPlayer(){
        initializeNewUser();
    }

    public CardPlayer(String name, int stackValue) {
        this.name = name;
        this.stackValue = stackValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStackValue() {
        return stackValue;
    }

    public void setStackValue(int stackValue) {
        this.stackValue = stackValue;
    }

    private void initializeNewUser() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and Welcome to BlackJack! My nme is Jade, what is your name?");
        this.name = scanner.next();

        System.out.println("Thanks, " + this.name + "! How much money would you like to start with?");
        this.stackValue = scanner.nextInt();
    }
}
