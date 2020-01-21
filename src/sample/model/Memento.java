package sample.model;

public class Memento {

    private String state; //Stan gry

    public Memento(String state){
        this.state = state;
    }


    public String getState(){
        return state;
    }
}
