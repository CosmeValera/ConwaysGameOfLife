package model;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private ESTADO state;
    private List<Cell.ESTADO> neighbourCells;
    
    public enum ESTADO {
        DEAD, ALIVE
    }

    public Cell() {
        state = ESTADO.DEAD;
        neighbourCells = new ArrayList<>();
    }

    public ESTADO getState() {
        return state;
    }

    public void setState(ESTADO state) {
        this.state = state;
    }

    public List<ESTADO> getNeighbourCells() {
        return neighbourCells;
    }

    public void setNeighbourCells(List<ESTADO> neighbourCells) {
        this.neighbourCells = neighbourCells;
    }

}
