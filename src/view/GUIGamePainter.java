package view;

import model.Cell;
import model.IGamePainter;

import javax.swing.*;
import java.awt.*;

public class GUIGamePainter implements IGamePainter {

    private final int WIDTH = 600;
    private final int LENGTH = 560;
    private final int SIZE = 30;

    private JFrame jFrame;
    private JPanel jPanel;
    private Graphics g;

    public GUIGamePainter() {

        this.jPanel = new JPanel(new BorderLayout());

        this.jFrame = new JFrame("Game of Life");
        this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jFrame.setSize(WIDTH * SIZE + 15,
                LENGTH * SIZE + 45);
        this.jFrame.setVisible(true);

        this.jPanel.setSize(WIDTH * SIZE + 15,
                LENGTH * SIZE + 45);
        this.jFrame.add(this.jPanel);

        this.jFrame.setResizable(false);

        this.g = jPanel.getGraphics();
    }

    @Override
    public void paint(Cell[][] cells) {
        allBlack();
        for (int i = 0; i < SIZE/2; i++) {
            for (int j = 0; j < SIZE/2; j++) {

                Cell instanceCell = cells[i][j];
                if (instanceCell.getState().equals(Cell.STATE.ALIVE)) {
                    g.setColor(Color.black);
                    g.drawOval((int) ((i + 0.33) * SIZE),
                            (int) ((j + 0.33) * SIZE),
                            (int) (0.67 * SIZE),
                            (int) (0.67 * SIZE));
                }
            }
        }
    }

    private void allBlack() {
        g.setColor(Color.white);
        g.fillRect(0, 0, this.WIDTH * SIZE*1000,
                this.LENGTH * SIZE *1000);
    }

}
