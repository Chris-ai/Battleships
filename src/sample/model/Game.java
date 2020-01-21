package sample.model;

import java.util.List;

public class Game {

    private static Game INSTANCE = null;
    private String state;
    private List<PlayerModel> players;
    private Computer Level;

    private Game(BoardModel playerBoard, PlayerModel player){

    }


    public static Game getINSTANCE() {
        if(INSTANCE == null)
            INSTANCE = new Game();
        return INSTANCE;
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
}
