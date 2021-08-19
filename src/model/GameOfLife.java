package model;

public class GameOfLife {
    public static final int ITERATION_TIME_IN_MILISECONDS = 1000;

    private final IGamePainter gamePainter;

    public GameOfLife(IGamePainter gamePainter) {
        this.gamePainter = gamePainter;
    }

    public void play(Cell[][] cells) throws InterruptedException {
        GameLogic gameLogic = new GameLogic();

        while (true) {
            Cell[][] updatedCells = gameLogic.update(cells);
            gamePainter.paint(updatedCells);
            cells = updatedCells;

            Thread.sleep(ITERATION_TIME_IN_MILISECONDS);
        }
    }
}
