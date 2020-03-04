package labs_examples.objects_classes_methods.labs.oop.C_blackjack.controller;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack.*;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class BlackJackGame extends Game implements CardGame {
    public void play() {

        setName("BlackJack");
        setBasicRules("The player closest to 21 without going over wins");

        CardPlayer computer = new CardPlayer("Computer", 10000);
        CardPlayer user = new CardPlayer();

        Deck deck = new Deck();
        int count = 0;

        do {
            deck = new Deck();

            System.out.println("\nGame #" + Deck.getFreshDecksLoaded());

            printAsciiArt();

            handleBets(user);

            dealInitialCards(user, computer, deck);

            while (true) {
                if (checkForHit(user)) {
                    deal(user, deck);
                } else {
                    break;
                }
            }

            while (true) {
                if (checkForHit(computer)) {
                    deal(computer, deck);
                } else {
                    break;
                }
            }

            scoreHands(user, computer);

        } while (continuePlaying(user, computer));
        System.out.println("\n Thanks again for playing BlackJack with me! You're walking away with $" + user.getStackValue() + "In chips.");
        if (user.getStackValue() == 0){
            System.out.println("I thought you were a pro! Where'd all your money go?!");
        }

        System.out.println("Goodbye.");
    }


    private boolean continuePlaying(CardPlayer user, CardPlayer computer) {

        Scanner scanner = new Scanner(System.in);

        if (user.getStackValue() < 1){
            System.out.println("\n Sorry, you're out of cash. Time to go. Goodbye.");
            return false;
        }
        System.out.println("That was game #" + Deck.getFreshDecksLoaded() + " , would you like to play another game? " +
                "Enter \"y\" for yes and \"n\"  for NO");

        String anotherGame = scanner.next();

        if (anotherGame.equalsIgnoreCase("y")){
            user.getHand().clear();
            computer.getHand().clear();
            return true;
        }else {
            System.out.println("\nThanks for playing! Sorry to see you leave!");
            return false;
        }
    }

    private void scoreHands(CardPlayer user, CardPlayer computer) {
        int computerScore = analyzeHand(computer);
        int userScore = analyzeHand(user);

        int computerDiff = 21 - computerScore;
        int userDiff = 21 - userScore;

        String computerHand = computer.getHand().toString();
        String output = "";

        if (computerScore == 21 &&  userScore == 21){
            output = "\n YOU TIED!! I (computer) score" + computerScore + "with" + computerHand;
            user.setStackValue(user.getStackValue() - (user.getBet()/2));
        }else if (computerScore == 21){
            output = "\n YOU LOSE!! I (computer) landed 21 with " + computerScore + "with" + computerHand;
            user.setStackValue(user.getStackValue() - user.getBet());
        }else if (userScore > 21){
            output = "YOU BUSTED!! Sorry about that.";
            user.setStackValue(user.getStackValue() - user.getBet());
            printUserChipBalance(user);
        } else if (userDiff > computerDiff && computerDiff >= 0){
            output = "YOU LOSE! I (Computer) scored " + computerScore + "with" + computerHand;
            user.setStackValue(user.getStackValue() - user.getBet());
            printUserChipBalance(user);
        }else if (userDiff < computerDiff && userDiff >= 0){
            output = "\nYOU WIN!! I (Computer) score " + computerScore + " with " + computerHand;
            user.setStackValue((user.getStackValue() + (user.getBet()) * 3));
            printUserChipBalance(user);
        }else if (computerScore > 21) {
            output = "\nYOU WIN!! I (Computer) busted with " + computerScore + " with " + computerHand;
            user.setStackValue((user.getStackValue() + (user.getBet()) * 3));
            printUserChipBalance(user);
        }
        System.out.println(output);
        writeOutputToFile(output);
    }

    private void writeOutputToFile(String output) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/labs_examples/objects_classes_methods/labs/oop/C_blackjack/blackjack_results.txt", true))){
            bw.write("\n\n" + getName());
            bw.write("\n" + getBasicRules());
            bw.write(output);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void printUserChipBalance(CardPlayer user) {
        System.out.println("You've currently got $" + user.getStackValue() + "worth of chips");
    }

    private boolean checkForHit(CardPlayer user) {

        Scanner scanner = new Scanner(System.in);
        int currentScore = analyzeHand(user);

        if(!user.getName().equalsIgnoreCase("Computer")){
            System.out.println("\n -- The current score of your hand is " + currentScore + "--");
            System.out.println("\n would you like another card? \"y\" for Yes and \"n\" for NO");

            String response = scanner.next();

            if (response.equalsIgnoreCase("y")){
                return true;
            }else {
                return false;
            }
        }else {
            if(currentScore <= 16){
                return true;
            }else {
                return false;
            }
        }
    }

    private int analyzeHand(CardPlayer user) {

        int currentScore = 0;

        for (Card c : user.getHand()){
            currentScore += c.getScoreValue();
        }

        return currentScore;
    }

    private void dealInitialCards(CardPlayer user, CardPlayer computer, Deck deck) {
        deal(user, deck);
        deal(computer, deck);
        deal(user, deck);
        deal(computer, deck);

        System.out.println("\n------------------------------------------------------------");
        System.out.println("Your first card is: " + user.getHand().get(0).customToString());
        System.out.println("Your second card is: " + user.getHand().get(0).customToString());
        System.out.println("------------------------------------------------------------");
        System.out.println("My (computer) first card is: " + computer.getHand().get(0).customToString());
        System.out.println("My (computer) second card is FACE DOWN!");

        System.out.println("------------------------------------------------------------");


    }

    private void printAsciiArt() {

        System.out.println("\n---------------------------------------------");
        System.out.println("            Let's play some BlackJack");
        System.out.println("                                        _");
        System.out.println("     ,'`.     _   _         /\\        _(_)_");
        System.out.println("    (_,._)   ( ` ' )       <  >      (_)+(_)");
        System.out.println("      /\\      `. ,'         \\/          |");
        System.out.println("---------------------------------------------");
        System.out.println();
    }

    @Override
    public void deal(CardPlayer player, Deck deck) {

       int randomNum = getRandomCard(deck);
       Card card = deck.getCardAt(randomNum);
       player.getHand().add(card);

    }

    private int getRandomCard(Deck deck) {

        Random random = new Random();
        int n = random.nextInt(51) + 0;

        while(deck.isCardUsed(n)){
            n = random.nextInt(51) + 0;
        }
        deck.getUsedCards().add(n);
        return n;
    }

    @Override
    public void handleBets(CardPlayer player) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow much would you like to bet on this game?");
        System.out.println("You're currently holding $ " + player.getStackValue() + " worth of chips ");

        int bet = scanner.nextInt();

        if(bet <= player.getStackValue()){

            if (bet == player.getStackValue()){
                System.out.println("Going all in ");
            }
            player.setBet(bet);

        }else {
            do {
                System.out.println("Sorry you cannot bet more than you got! please bet less than $ " + player.getStackValue());
                System.out.println("How much would you like to bet?");
                bet = scanner.nextInt();
            }while(bet >= player.getStackValue());
            player.setBet(bet);
        }
    }
}
