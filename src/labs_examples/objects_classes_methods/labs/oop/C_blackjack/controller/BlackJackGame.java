package labs_examples.objects_classes_methods.labs.oop.C_blackjack.controller;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack.*;

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

        do{
            deck = new Deck();

            System.out.println("\nGame #" + Deck.getFreshDecksLoaded());

            printAsciiArt();

            handleBets(user);
            
            dealInitialCards(user, computer, deck);

            while(true){
                if(checkForHit(user)){
                    deal(user, deck);
                } else {
                    break;
                }
            }

            while(true){
                if(checkForHit(computer)){
                    deal(computer, deck);
                } else {
                    break;
                }
            }
        }while(count < 1);

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
