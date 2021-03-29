package ivge;

public class Microsoft implements GameCreator {
    @Override
    public Game newGame() {
        return new MicrosoftGame();
    }
}
