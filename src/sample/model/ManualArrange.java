package sample.model;

import java.util.List;

public class ManualArrange implements Strategy {


    @Override
    public int[][] setShipsOnBoard(int X, int Y, int[][] Board, List<ShipModel> ShipList) {
        for(ShipModel s :ShipList) {
            if (s.getOrientation() == 0) {
                for (int i = 0; i < s.getLength(); i++) {
                    Board[s.getX()][s.getY() + i] = 1;
                }
            } else {
                for (int i = 0; i < s.getLength(); i++) {
                    Board[s.getX() + i][s.getY()] = 1;
                }
            }
        }
        return Board;
    }

}
