package ivge;

public class Steam implements GameCreator{

    @Override
    public Game newGame() {
        return new SteamGame();
    }
}
