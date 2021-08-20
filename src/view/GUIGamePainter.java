package view;

import model.Cell;
import model.IGamePainter;

import javax.swing.*;
import java.awt.*;

public class GUIGamePainter implements IGamePainter {

    private double width;
    private double length;
    private final int SIZE = 30;

    private JFrame jFrame;
    private JPanel jPanel;
    private Graphics g;

    public GUIGamePainter(int width, int length) {
        this.width= width;
        this.length = length*0.3;

        this.jPanel = new JPanel(new BorderLayout());

        this.jFrame = new JFrame("Game of Life");
        this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jFrame.setSize((int) this.width * SIZE + 15,
                (int) this.length * SIZE + 45);
        this.jFrame.setVisible(true);

        this.jPanel.setSize((int) this.width * SIZE + 15,
                (int) this.length * SIZE + 45);
        this.jFrame.add(this.jPanel);

        this.jFrame.setResizable(false);

        this.g = jPanel.getGraphics();
    }

    @Override
    public void paint(Cell[][] cells) {
        allBlack();
        for (int i = 0; i < width-1; i++) {
            for (int j = 0; j < length; j++) {

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
        g.fillRect(0, 0, (int)this.width * SIZE*1000,
                (int)this.length * SIZE *1000);
    }

}
