package sample.model;

import java.util.List;
import java.util.Random;
import java.util.SimpleTimeZone;

public class AutoArrange implements Strategy {
        private ShipSimpleFactory s;

        @Override
        public int[][] setShipsOnBoard(int X, int Y, int[][] Board, List<ShipModel> ShipList) {
            s = new ShipSimpleFactory();
            sb5(X,Y,Board,ShipList);
            sb4(X,Y,Board,ShipList);
            sb3(X,Y,Board,ShipList);
            sb2(X,Y,Board,ShipList);

            return Board;
        }

        private void sb5(int X, int Y, int[][] Board, List<ShipModel> ShipList ) {
            Random random = new Random();
            int x = random.nextInt(X);
            int y = random.nextInt(Y);
            int orient = random.nextInt(2);

            int shipLenght = 5;



            if (orient == 0) {
                while (y > shipLenght) {
                    y--;
                }


                for (int i = 0; i < shipLenght; i++) {

                    Board[x][y + i] = 5;
                }
                ShipList.add(s.place1stShip(X,Y,orient));

            } else {
                while (x > shipLenght) {
                    x--;
                }


                for (int i = 0; i < shipLenght; i++) {

                    Board[x+i][y] = 5;
                }
                ShipList.add(s.place1stShip(X,Y,orient));

            }


        }
        private void sb4(int X, int Y, int[][] Board, List<ShipModel> ShipList) {
            Random random = new Random();
            int x = random.nextInt(X);
            int y = random.nextInt(Y);
            int orient = random.nextInt(2);
            int shipLenght = 4;

            if (orient == 0) {
                while (y > shipLenght) {
                    y--;
                }
                if((x+1)>X-1||(x-1)<0||(y-1)<0||(y+4)>X){
                    sb4(X,Y,Board,ShipList);
                }
                else if (Board[x][y] == 0 && Board[x-1][y] == 0&&Board[x+1][y] == 0&&
                        Board[x][y+1] == 0 && Board[x][y+2] == 0 && Board[x][y+3] == 0&&
                        Board[x+1][y+1] == 0&&Board[x-1][y+1] == 0&&
                        Board[x+1][y+2] == 0&&Board[x-1][y+2] == 0&&
                        Board[x+1][y+3] == 0&&Board[x-1][y+3] == 0&&
                        Board[x][y+4] == 0&&Board[x][y-1] == 0) {
                    for (int i = 0; i < shipLenght; i++) {

                        Board[x][y+i]=4;
                    }
                    ShipList.add(s.place2ndShip(X,Y,orient));
                } else {
                    sb4(X,Y,Board,ShipList);
                }

            } else {
                while (x > shipLenght) {
                    x--;
                }
                if((y+1)>X-1||(y-1)<0||(x-1)<0||(x+4)>X){
                    sb4(X,Y,Board,ShipList);
                }
                else if (Board[x+1][y] == 0 && Board[x+2][y] == 0 && Board[x+3][y] == 0 &&
                        Board[x][y+1] == 0&&Board[x][y-1] == 0&&
                        Board[x+1][y+1] == 0&&Board[x+1][y-1] == 0&&
                        Board[x+2][y+1] == 0&&Board[x+2][y-1] == 0&&
                        Board[x+3][y+1] == 0&&Board[x+3][y-1] == 0&&
                        Board[x+4][y] == 0&&Board[x-1][y] == 0) {
                    for (int i = 0; i < shipLenght; i++) {

                        Board[x+i][y] = 4;
                    }
                    ShipList.add(s.place2ndShip(X,Y,orient));
                } else {
                    sb4(X,Y,Board,ShipList);
                }

            }


        }

        private void sb3(int X, int Y, int[][] Board, List<ShipModel> ShipList) {
            Random random = new Random();
            int x = random.nextInt(X);
            int y = random.nextInt(Y);
            int orient = random.nextInt(2);
            int shipLenght = 3;


            if (orient == 0) {
                while (y > shipLenght) {
                    y--;
                }
                if((x+1)>X-1||(x-1)<0||(y-1)<0||(y+3)>Y-1){
                    sb3(X,Y,Board,ShipList);
                }
                else if (Board[x][y] == 0 && Board[x+1][y] == 0&&Board[x-1][y] == 0&&
                        Board[x][y+1] == 0 && Board[x][y+2] == 0&&
                        Board[x+1][y+1] == 0&&Board[x-1][y+1] == 0&&
                        Board[x+1][y+2] == 0&&Board[x-1][y+2] == 0&&
                        Board[x][y+3] == 0&&Board[x][y-1] == 0) {
                    for (int i = 0; i < shipLenght; i++) {

                        Board[x][y+i] = 3;
                    }
                    ShipList.add(s.place3rdShip(X,Y,orient));
                } else {
                    sb3(X,Y,Board,ShipList);
                }

            } else {
                while (x > shipLenght) {
                    x--;
                }
                if((y+1)>X-1||(y-1)<0||(x+3)>X-1||(x-1)<0){
                    sb3(X,Y,Board,ShipList);
                }
                else if (Board[x][y] == 0 && Board[x][y+1] == 0&&Board[x][y-1] == 0&&
                        Board[x+1][y] == 0 && Board[x+2][y] == 0&&
                        Board[x+1][y+1] == 0&&Board[x+1][y-1] == 0&&
                        Board[x+2][y+1] == 0&&Board[x+2][y-1] == 0&&
                        Board[x+3][y] == 0&&Board[x-1][y] == 0) {
                    for (int i = 0; i < shipLenght; i++) {

                        Board[x+i][y]=3;
                    }
                    ShipList.add(s.place3rdShip(X,Y,orient));
                } else {
                    sb3(X,Y,Board,ShipList);
                }
            }



        }
        private void sb2(int X, int Y, int[][] Board, List<ShipModel> ShipList) {
            Random random = new Random();
            int x = random.nextInt(X);
            int y = random.nextInt(Y);
            int orient = random.nextInt(2);
            int shipLenght = 2;


            if (orient == 0) {
                while (y > shipLenght) {
                    y--;
                }
                if((x+1)>X-1||(x-1)<0||(y-1)<0||(y+2)>X-1){
                    sb2(X,Y,Board,ShipList);
                }
                else if (Board[x][y] == 0 && Board[x+1][y] == 0&&Board[x-1][y] == 0&&
                        Board[x][y+1] == 0 &&
                        Board[x+1][y+1] == 0&&Board[x-1][y+1] == 0&&

                        Board[x][y+2] == 0&&Board[x][y-1] == 0) {
                    for (int i = 0; i < shipLenght; i++) {

                        Board[x][y+i] = 2;
                    }
                    ShipList.add(s.place4thShip(X,Y,orient));
                } else {
                    sb2(X,Y,Board,ShipList);
                }

            } else {
                while (x > shipLenght) {
                    x--;
                }
                if((y+1)>-1||(y-1)<0||(x+2)>-1||(x-1)<0){
                    sb2(X,Y,Board,ShipList);
                }
                else if (Board[x][y] == 0 && Board[x][y+1] == 0&&Board[x][y-1] == 0&&
                        Board[x+1][y] == 0 &&
                        Board[x+1][y+1] == 0&&Board[x+1][y-1] == 0&&

                        Board[x+2][y] == 0&&Board[x-1][y] == 0) {
                    for (int i = 0; i < shipLenght; i++) {

                        Board[x+i][y]=2;
                    }
                    ShipList.add(s.place4thShip(X,Y,orient));
                } else {
                    sb2(X,Y,Board,ShipList);
                }
            }



        }
    }