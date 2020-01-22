package sample.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static Game INSTANCE = null;
    private String state;
    private PlayerModel player;

    private Game(PlayerModel player){
        this.state="In progress";
        this.player=player;

    }


    public static Game getInstance(PlayerModel player)
    {
        if (INSTANCE == null)
            INSTANCE = new Game(player);

        return INSTANCE;
    }

    public void setPlayerMoves(int moves){
        this.player.setMoves(moves);
    }


    /**
     * Wzorzec pamiątka
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

    public PlayerModel getPlayer() {
        return player;
    }
}
