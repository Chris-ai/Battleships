package sample.model;

import java.util.ArrayList;
import java.util.List;

public class BoardModel {

    private int X;
    private int Y;
    private int[][] Board;
    private List<ShipModel> ShipList = new ArrayList<ShipModel>();
    private Strategy s;


<<<<<<< Updated upstream
<<<<<<< HEAD
    public BoardModel(int X, int Y,Strategy s,List<ShipModel> ShipList) {
        this.X=X;
        this.s=s;
        this.Y=Y;
        this.Board = new int[X][Y];
=======
    public BoardModel(Strategy s,List<ShipModel> ShipList) {
=======
    public BoardModel(int X, int Y, Strategy s,List<ShipModel> ShipList) {
        this.Board = new int[X][Y];
>>>>>>> Stashed changes
        this.X=10;
        this.s=s;
        this.Y=10;
        this.ShipList=ShipList;
        this.Board = new int[X][Y];

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {

                Board[i][j] = 0;
            }
        }
    }
<<<<<<< Updated upstream

    public BoardModel(Strategy s) {
=======
    public BoardModel(int X, int Y, Strategy s) {
        this.Board = new int[X][Y];
>>>>>>> Stashed changes
        this.X=10;
        this.s=s;
        this.Y=10;
        this.Board = new int[X][Y];

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {

                Board[i][j] = 0;
            }
        }
    }


    public void shootBoard(Position p){
        Board[p.getX()][p.getY()] = 1;
    }
    public int getBoardStatus(Position p) {
        return Board[p.getX()][p.getY()];
    }

    public int[][] getBoard() {
        return Board;
    }
    public void addShip(ShipModel s){
        ShipList.add(s);
    }

    public List<ShipModel> getShipList() {
        return ShipList;
    }
    public int getPos(int x,int y){
        return Board[x][y];
    }

    public void setPos(int x,int y, int pos){
        Board[x][y] = pos;
    }

    public void printBoardpom(){
        int char_key = 65;
        System.out.print("  ");
        for(int i = 0; i < Board.length; i++) System.out.print((char)(char_key+i) + " ");
        System.out.println();
        for(int i = 0; i < Board.length; i++){
            System.out.print(i + " ");
            for(int j = 0; j < Board.length; j++){
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setShipBoard(){
        Board=s.setShipsOnBoard(X,Y,Board,ShipList);
    }
}
