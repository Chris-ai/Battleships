package sample.model;

public class ShipModel {

    private int orientation;
    private int x,y;
    private int length;
    private int demage;


    public ShipModel(int X, int Y, int length, int demage, int orientation){
        this.x = X;
        this.y = Y;
        this.length = length;
        this.demage = demage;
        this.orientation = orientation; // 1 - pozioma 0 - pionowa
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }
}
