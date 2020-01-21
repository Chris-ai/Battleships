package sample.model;

import javafx.geometry.Pos;

import java.util.List;
import java.util.Random;

public class Computer {

    private int moves;
    private int points;
    private String name = "Kozak";

    public Computer(){
        this.moves=0;
        this.points=0;
    }

    public String getName() {
        return name;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getMoves() {
        return moves;
    }

    public int getPoints() {
        return points;
    }

    public Position easyShot(int size){
        Random random = new Random();
        int x = random.nextInt(size);
        int y = random.nextInt(size);
        Position position = new Position(x,y);

        return position;
    }

    public Position hardShot(BoardModel board, int size){
        Random random = new Random();
        int x = random.nextInt(size);
        int y = random.nextInt(size);
        Position position = new Position(x,y);

        return position;
    }
}
