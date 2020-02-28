package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackJackGame extends Game {
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

        }while(true);

    }

    private void printAsciiArt() {

        System.out.println("\n-----------------------------------------");
        System.out.println("     Let's play some BlackJack      ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
