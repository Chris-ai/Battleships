package sample.model;

import java.util.List;
import java.util.Random;

public class Easy extends Computer{


    public Easy(BoardModel playerBoard, List<Position> freepositions, List<Position> firedpositions) {
        super(playerBoard, freepositions, firedpositions);
    }

    @Override
    Position nextShoot() {
        Random rand = new Random();
        int x = rand.nextInt();
        int y = rand.nextInt();

        Position shoot = new Position(x,y);

        if(playerBoard.getBoardStatus(shoot) == 0){
             playerBoard.shootBoard(shoot);
        } else {
            while (playerBoard.getBoardStatus(shoot) != 0) {
                x = rand.nextInt();
                y = rand.nextInt();
            }
            shoot.setX(x);
            shoot.setY(y);
            playerBoard.shootBoard(shoot);
        }
        return shoot;
    }
}
