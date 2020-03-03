package labs_examples.objects_classes_methods.labs.oop.C_blackjack.controller;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack.CardGame;
import labs_examples.objects_classes_methods.labs.oop.C_blackjack.CardPlayer;
import labs_examples.objects_classes_methods.labs.oop.C_blackjack.Deck;
import labs_examples.objects_classes_methods.labs.oop.C_blackjack.Game;

import java.util.Scanner;

public class BlackJackGame extends Game implements CardGame {
    public void play() {

        setName("BlackJack");
        setBasicRules("The player closest to 21 without going over wins");

        CardPlayer computer = new CardPlayer("Computer", 10000);
        CardPlayer user = new CardPlayer();

        Deck deck = new Deck();

        do{
            deck = new Deck();

            System.out.println("\nGame #" + Deck.getFreshDecksLoaded());

            printAsciiArt();

            handleBets(user);

        }while(true);

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
            }while(bet >= player.getStackValue())
        }
    }
}
