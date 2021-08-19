package model;

public class Cell {

    private int aliveNeighbourCells;
    private STATE state;

    public static Cell dead() {
        return new Cell(STATE.DEADD);
    }

    public static Cell alive() {
        return new Cell(STATE.ALIVE);
    }

    public enum STATE {
        DEADD, ALIVE
    }

    public Cell() {
        aliveNeighbourCells = 0;
        state = STATE.DEADD;
    }

    public Cell(STATE state) {
        aliveNeighbourCells = 0;
        this.state = state;
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

    // Methods
    public void updateCell() {
        if (this.state.equals(Cell.STATE.ALIVE)) { //Alive
            cellDiesUnless2Or3Neighbours();
        } else if (this.state.equals(Cell.STATE.DEADD)) { //Dead
            cellRevivesWith3Neighbours();
        }
    }

    private void cellDiesUnless2Or3Neighbours() {
        if (aliveNeighbourCells != 2 && aliveNeighbourCells != 3) {
            state = Cell.STATE.DEADD;
        }
    }

    private void cellRevivesWith3Neighbours() {
        if (aliveNeighbourCells == 3) {
            state = Cell.STATE.ALIVE;
        }
    }

}
