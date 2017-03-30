import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise19 {

    public static void mainDraw(Graphics graphics) {
        // draw the night sky:
        // - The background should be black
        // - The stars can be small squares
        // - The stars should have random positions on the canvas
        // - The stars should have random color (some shade of grey)

        int R = (int) (Math.random() * 255);
        Color randomColor = new Color(R, R, R);
        for (int i = 0; i < 50; i++) {
            int xPos = (int) (Math.random() * 300);
            int yPos = (int) (Math.random() * 300);
            int xSize = (int) (Math.random() * 15);
            graphics.setColor(randomColor);
            graphics.fillRect(xPos, yPos, xSize, xSize);
        }

    }

    //    Don't touch the code below
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(300, 300));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            this.setBackground(Color.BLACK);
            mainDraw(graphics);

        }
    }

}