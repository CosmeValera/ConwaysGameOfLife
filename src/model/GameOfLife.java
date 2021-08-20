package model;

public class GameOfLife {
    public static final int ITERATION_TIME_IN_MILISECONDS = 500;

    private final IGamePainter gamePainter;

    public GameOfLife(IGamePainter gamePainter) {
        this.gamePainter = gamePainter;
    }

    public void play(Cell[][] cells) throws InterruptedException {
        GameLogic gameLogic = new GameLogic();

        //openFrame();
        while (true) {
            Cell[][] updatedCells = gameLogic.update(cells);
            cells = updatedCells;
            gamePainter.paint(cells);

            Thread.sleep(ITERATION_TIME_IN_MILISECONDS);
        }
    }
}
