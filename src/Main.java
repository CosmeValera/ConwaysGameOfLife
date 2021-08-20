import model.Cell;
import model.GameOfLife;
import view.GUIGamePainter;

public class Main {

    private static final int rows = 15;
    private static final int columns = 50;

    public static void main(String[] args) throws InterruptedException {
        Cell[][] initialMatrix = createInitialMatrix();

        GUIGamePainter guigp = new GUIGamePainter();

        GameOfLife game = new GameOfLife(
                //new TerminalGamePainter()
                guigp
        );

        game.play(initialMatrix);
    }

    private static Cell[][] createInitialMatrix() {
        Cell[][] cells = new Cell[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (Math.random() < 0.25) {
                    cells[i][j] = Cell.alive();
                } else {
                    cells[i][j] = Cell.dead();
                }
            }
        }
        return cells;
    }
}
