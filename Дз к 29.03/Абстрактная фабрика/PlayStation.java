package ivge;

public class PlayStation implements GameCreator {
    @Override
    public Game newGame() {
        return new PlayStationGame();
    }
}
