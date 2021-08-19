package view;

import model.Cell;

public class ConsolePaint implements IPaint {
    
    @Override
    public void paint(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell instanceCell = cells[i][j];
                if (instanceCell.getState().equals(Cell.STATE.ALIVE)) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" _ ");
                }
            }
            System.out.println();
        }
    }
}
