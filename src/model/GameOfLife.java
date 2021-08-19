package model;

import model.Cell.STATE;
import view.ConsolePaint;
import view.Frame;
import view.IPaint;

public class GameOfLife{

    public static final int ITERATION_TIME_IN_MILISECONDS = 500;

    public static void main(String[] args) throws InterruptedException {
//        //DieHard
//        Cell[][] cells = {
//            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
//            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
//            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
//            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.ALIVE), new Cell(STATE.ALIVE), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
//            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.ALIVE), new Cell(STATE.ALIVE), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
//            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.ALIVE), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
//            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
//            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
//            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
//        };
        //Glider
        Cell[][] cells = {
            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.ALIVE), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.ALIVE), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
            {new Cell(STATE.DEADD), new Cell(STATE.ALIVE), new Cell(STATE.ALIVE), new Cell(STATE.ALIVE), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},
            {new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD), new Cell(STATE.DEADD)},};

        
        GameOfLife gol = new GameOfLife();
        ConsolePaint cp = new ConsolePaint();
        Frame frame = new Frame();
        int num = 1;
        
        
        while (true) {
            IPaint ip = new IPaint() {
                @Override
                public void paint(Cell[][] cells) {
//                    cp.paint(cells);
//                    frame.paint(cells);
                }
            } ;
            ip.paint(cells);

            loopCells(cells);

            updateCells(cells);

            System.out.println("Loop " + num++);
            Thread.sleep(ITERATION_TIME_IN_MILISECONDS);
        }
    }

    private static void loopCells(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell instanceCell = cells[i][j];
                instanceCell.setAliveNeighbourCells(0);

                checkNeighbourCells(i, cells, j, instanceCell);
            }
        }
    }

    private static void checkNeighbourCells(int i, Cell[][] cells, int j, Cell instanceCell) {
        checkUpperLeftCell(i, cells, j, instanceCell);
        checkUpperCell(i, cells, j, instanceCell);
        checkUpperRightCell(i, cells, j, instanceCell);
        checkLeftCell(j, cells, i, instanceCell);
        checkRightCell(j, cells, i, instanceCell);
        checkLowerLeftCell(i, cells, j, instanceCell);
        checkLowerCell(i, cells, j, instanceCell);
        checkLowerRightCell(i, cells, j, instanceCell);
    }

    private static void checkUpperLeftCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i > 0 && j > 0) {
            Cell upperLeftCell = cells[i - 1][j - 1];
            if (upperLeftCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private static void checkUpperCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i > 0) {
            Cell upperCell = cells[i - 1][j];
            if (upperCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private static void checkUpperRightCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i > 0 && j < cells[i].length - 1) {
            Cell upperRightCell = cells[i - 1][j + 1];
            if (upperRightCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private static void checkLeftCell(int j, Cell[][] cells, int i, Cell instanceCell) {
        if (j > 0) {
            Cell leftCell = cells[i][j - 1];
            if (leftCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private static void checkRightCell(int j, Cell[][] cells, int i, Cell instanceCell) {
        if (j < cells[i].length - 1) {
            Cell rightCell = cells[i][j + 1];
            if (rightCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private static void checkLowerLeftCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i < cells.length - 1 && j > 0) {
            Cell lowerLeftCell = cells[i + 1][j - 1];
            if (lowerLeftCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private static void checkLowerCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i < cells.length - 1) {
            Cell lowerCell = cells[i + 1][j];
            if (lowerCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private static void checkLowerRightCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i < cells.length - 1 && j < cells[i].length - 1) {
            Cell lowerRightCell = cells[i + 1][j + 1];
            if (lowerRightCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private static void updateCells(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell instanceCell = cells[i][j];
                instanceCell.updateCell();
            }
        }
    }
}
