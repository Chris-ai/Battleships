package sample.model;

import java.util.ArrayList;

public class PlayerModel {


    private int moves;
    private int points;
    private String nickname;

    public PlayerModel(String nickname){
        this.nickname = nickname;
        this.points = 0;
        this.moves = 0;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int Points){
        this.points = Points;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves){
        this.moves = moves;
    }
}
