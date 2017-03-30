import javax.swing.*;
import java.awt.*;
import java.util.Collections;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise20 {

    public static void mainDraw(Graphics graphics){
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/triangles/r5.png]
        int xpoint[] = {0,10,20};
        int ypoint[] = {300,285,300};
        int npoint = 3;
        graphics.setColor(Color.BLACK);
        graphics.drawPolygon(xpoint,ypoint,npoint);
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}