package sample.model;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hard extends Computer {

    private Position last_fired_position;

    public Hard(BoardModel playerBoard, List<Position> freepositions, List<Position> firedpositions) {
        super(playerBoard, freepositions, firedpositions);

        for(int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++){
                Position p = new Position(i,j);
                freepositions.add(p);
            }
    }

    private Position randFromFree(){
        Random rand = new Random();
        int x = rand.nextInt();
        int y = rand.nextInt();
        Position random = new Position(x,y);

        for(Position p: freepositions) {
            if(p.getX() == random.getX() && p.getY() == random.getY()) {
                return random;
            } else {
                 while(p.getX() == random.getX() && p.getY() == random.getY()) {
                      x = rand.nextInt();
                      y = rand.nextInt();
                      random = new Position(x,y);
                 }
            }
        }

        return random;
    }

    @Override
    Position nextShoot() {

        Position shoot = randFromFree();

        if(playerBoard.getBoardStatus(shoot) == 1){
            last_fired_position = shoot;

            shoot.setX(last_fired_position.getX());
            shoot.setX(last_fired_position.getY());
            playerBoard.shootBoard(shoot);
            freepositions.remove(shoot);
            firedpositions.add(shoot);


        } else {
            playerBoard.shootBoard(shoot);
            freepositions.remove(shoot);
            firedpositions.add(shoot);
        }

        return shoot;
    }
}
