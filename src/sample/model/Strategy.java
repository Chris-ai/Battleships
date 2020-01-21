package sample.model;

import java.util.List;

public interface Strategy {

    int[][] setShipsOnBoard(int X, int Y, int[][] Board, List<ShipModel> ShipList);
}
