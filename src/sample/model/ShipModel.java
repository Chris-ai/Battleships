package sample.model;

import sample.Observer;
import sample.Subject;

import java.util.ArrayList;

public class ShipModel implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    private String name;
    private int orientation;
    private int x,y;
    private int length;
    private int dmg;
    private int state=1; // 1-caly , 0-uszkodzony -1 - zatopiony


    public ShipModel(String name,int length){
        this.name=name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDemage() {
        return dmg;
    }

    public void setDemage(int demage) {
        this.dmg = demage;
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

    public void damageShip() {
        dmg++;
    }

    public int getState() {
        return state;
    }

    public void setState(int state)  {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers()  {
        System.out.println(observers.size());
        for (Observer ob : observers) {
            System.out.println("Notifying Observers on change in currency change");
            ob.update(this.state);

        }
    }
}
