package model;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private int position;
    private int aliveNeighbourCells;
    private boolean willChangeState;
    private STATE state;
//    private List<Cell.STATE> neighbourCells;
    
    public enum STATE {
        DEAD, ALIVE
    }

    public Cell() {
        position = 0;
        aliveNeighbourCells = 0;
        willChangeState = false;
        state = STATE.DEAD;
//        neighbourCells = new ArrayList<>();
    }

    public Cell(int numberPosition) {
        this.position = numberPosition;
        aliveNeighbourCells = 0;
        willChangeState = false;
        state = STATE.DEAD;
//        neighbourCells = new ArrayList<>();
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAliveNeighbourCells() {
        return aliveNeighbourCells;
    }

    public void setAliveNeighbourCells(int aliveNeighbourCells) {
        this.aliveNeighbourCells = aliveNeighbourCells;
    }

    
    public boolean isWillChangeState() {
        return willChangeState;
    }

    public void setWillChangeState(boolean willChangeState) {
        this.willChangeState = willChangeState;
    }

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }

//    public List<STATE> getNeighbourCells() {
//        return neighbourCells;
//    }
//
//    public void setNeighbourCells(List<STATE> neighbourCells) {
//        this.neighbourCells = neighbourCells;
//    }

}
