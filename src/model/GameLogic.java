package model;

public class GameLogic {
    public Cell[][] update(Cell[][] cells) {
        loopCells(cells);
        updateCells(cells);

        return cells;
    }

    private void loopCells(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell instanceCell = cells[i][j];
                instanceCell.setAliveNeighbourCells(0);

                checkNeighbourCells(i, cells, j, instanceCell);
            }
        }
    }

    private void checkNeighbourCells(int i, Cell[][] cells, int j, Cell instanceCell) {
        checkUpperLeftCell(i, cells, j, instanceCell);
        checkUpperCell(i, cells, j, instanceCell);
        checkUpperRightCell(i, cells, j, instanceCell);
        checkLeftCell(j, cells, i, instanceCell);
        checkRightCell(j, cells, i, instanceCell);
        checkLowerLeftCell(i, cells, j, instanceCell);
        checkLowerCell(i, cells, j, instanceCell);
        checkLowerRightCell(i, cells, j, instanceCell);
    }

    private void checkUpperLeftCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i > 0 && j > 0) {
            Cell upperLeftCell = cells[i - 1][j - 1];
            if (upperLeftCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private void checkUpperCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i > 0) {
            Cell upperCell = cells[i - 1][j];
            if (upperCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private void checkUpperRightCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i > 0 && j < cells[i].length - 1) {
            Cell upperRightCell = cells[i - 1][j + 1];
            if (upperRightCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private void checkLeftCell(int j, Cell[][] cells, int i, Cell instanceCell) {
        if (j > 0) {
            Cell leftCell = cells[i][j - 1];
            if (leftCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private void checkRightCell(int j, Cell[][] cells, int i, Cell instanceCell) {
        if (j < cells[i].length - 1) {
            Cell rightCell = cells[i][j + 1];
            if (rightCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private void checkLowerLeftCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i < cells.length - 1 && j > 0) {
            Cell lowerLeftCell = cells[i + 1][j - 1];
            if (lowerLeftCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private void checkLowerCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i < cells.length - 1) {
            Cell lowerCell = cells[i + 1][j];
            if (lowerCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private void checkLowerRightCell(int i, Cell[][] cells, int j, Cell instanceCell) {
        if (i < cells.length - 1 && j < cells[i].length - 1) {
            Cell lowerRightCell = cells[i + 1][j + 1];
            if (lowerRightCell.getState().equals(Cell.STATE.ALIVE)) {
                instanceCell.setAliveNeighbourCells(instanceCell.getAliveNeighbourCells() + 1);
            }
        }
    }

    private void updateCells(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell instanceCell = cells[i][j];
                instanceCell.updateCell();
            }
        }
    }
}
