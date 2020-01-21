package sample.model;

import javafx.geometry.Pos;

import java.util.List;

public abstract class Computer {

    protected int points;
    protected int moves;
    protected BoardModel playerBoard;
    protected List<Position> freepositions, firedpositions;

    public Computer(BoardModel playerBoard, List<Position> freepositions, List<Position> firedpositions){
        this.playerBoard = playerBoard;
        this.firedpositions = firedpositions;
        this.freepositions = freepositions;
    }

    abstract Position nextShoot();

    public Position makeTurn() {
        return null;
    }
}
