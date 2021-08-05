package model;

public class Cell {

    private int aliveNeighbourCells;
    private STATE state;
    private STATE nextState;

    public enum STATE {
        DEADD, ALIVE
    }

    public Cell() {
        aliveNeighbourCells = 0;
        state = STATE.DEADD;
        nextState = STATE.DEADD;
    }

    public Cell(STATE state) {
        aliveNeighbourCells = 0;
        this.state = state;
        nextState = state;
    }

    public int getAliveNeighbourCells() {
        return aliveNeighbourCells;
    }

    public void setAliveNeighbourCells(int aliveNeighbourCells) {
        this.aliveNeighbourCells = aliveNeighbourCells;
    }

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }

    public STATE getNextState() {
        return nextState;
    }

    public void setNextState(STATE nextState) {
        this.nextState = nextState;
    }

}
