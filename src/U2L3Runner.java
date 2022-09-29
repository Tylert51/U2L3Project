public class U2L3Runner {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();

        game.increaseScore(8);
        game.increaseScore(3);
        game.increaseScore(15);

        System.out.println("Players: " +  game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());



    }
}
