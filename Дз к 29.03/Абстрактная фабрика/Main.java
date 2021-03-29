package ivge;

public class Main {

    public static void main(String[] args) {
	    GameCreator gameCreator;

        gameCreator = new Steam();
        System.out.println(gameCreator.newGame());
        /*ivge.SteamGame@16b98e56 => создалась игра в steam*/

        gameCreator = new Microsoft();
        System.out.println(gameCreator.newGame());
        /*ivge.MicrosoftGame@4f3f5b24 => создалась игра в steam*/

        gameCreator = new PlayStation();
        System.out.println(gameCreator.newGame());
        /*ivge.ivge.PlayStationGame@6acbcfc0 => создалась игра в steam*/
    }
}