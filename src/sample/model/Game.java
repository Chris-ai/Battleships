package sample.model;

import java.util.List;

public class Game {

    private static Game INSTANCE = null;
    private int state;
    private List<PlayerModel> players;
    private Computer Level;

    private Game(PlayerModel Player1){

    }


    public static Game getINSTANCE() {

        if(INSTANCE == null)
            INSTANCE = new Game(new PlayerModel("1",0,0));
        return INSTANCE;
    }
}
