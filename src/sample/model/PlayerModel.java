package sample.model;

import java.util.ArrayList;

public class PlayerModel {


    private int moves;
    private int points;
    private String nickname;

    public PlayerModel(String nickname, int points, int moves){
        this.nickname = nickname;
        this.points = points;
        this.moves = moves;
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
