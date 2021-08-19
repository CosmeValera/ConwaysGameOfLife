package model;

public class Main {
    public static void main(String[] args) {
        Cell[][] initialMatrix = {
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.ALIVE), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.ALIVE), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.ALIVE), new Cell(Cell.STATE.ALIVE), new Cell(Cell.STATE.ALIVE), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
            {new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD), new Cell(Cell.STATE.DEADD)},
        };
 
        
        GameOfLife game = new GameOfLife();
      
        game.play(initialMatrix);
    }
}
