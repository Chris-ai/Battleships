package sample.model;

public class ShipSimpleFactory {
    private ShipModel s1;
    private ShipModel s2;
    private ShipModel s3;
    private ShipModel s4;

    public ShipSimpleFactory(){
        s1= new ShipModel("Carrier",5);
        s2=new ShipModel("Battleship ",4);
        s3=new ShipModel("Cruiser ",3 );
        s4=new ShipModel("Submarine ",2);

    }

    public ShipModel getS1() {
        return s1;
    }

    public ShipModel getS2() {
        return s2;
    }

    public ShipModel getS3() {
        return s3;
    }

    public ShipModel getS4() {
        return s4;
    }
    public ShipModel place1stShip(int X,int Y,int orient){
        s1.setX(X);
        s1.setY(Y);
        s1.setDemage(0);
        s1.setOrientation(orient);
        return s1;
    }
    public ShipModel place2ndShip(int X,int Y,int orient){
        s2.setX(X);
        s2.setY(Y);
        s2.setDemage(0);
        s2.setOrientation(orient);
        return s2;
    }
    public ShipModel place3rdShip(int X,int Y,int orient){
        s3.setX(X);
        s3.setY(Y);
        s3.setDemage(0);
        s3.setOrientation(orient);
        return s3;
    }
    public ShipModel place4thShip(int X,int Y,int orient){
        s4.setX(X);
        s4.setY(Y);
        s4.setDemage(0);
        s4.setOrientation(orient);
        return s4;
    }
}
