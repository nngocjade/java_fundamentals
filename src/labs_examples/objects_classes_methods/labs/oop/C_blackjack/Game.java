package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Game {

    private String name;
    private String basicRules;

    private static int numGamesPlayed = 0;
    private static int gameWonByComputer = 0;
    private static int gameWonByUser = 0;

    public static int getNumGamesPlayed() {
        return numGamesPlayed;
    }

    public static void setNumGamesPlayed(int numGamesPlayed) {
        Game.numGamesPlayed = numGamesPlayed;
    }

    public static int getGameWonByComputer() {
        return gameWonByComputer;
    }

    public static void setGameWonByComputer(int gameWonByComputer) {
        Game.gameWonByComputer = gameWonByComputer;
    }

    public static int getGameWonByUser() {
        return gameWonByUser;
    }

    public static void setGameWonByUser(int gameWonByUser) {
        Game.gameWonByUser = gameWonByUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBasicRules() {
        return basicRules;
    }

    public void setBasicRules(String basicRules) {
        this.basicRules = basicRules;
    }
}
