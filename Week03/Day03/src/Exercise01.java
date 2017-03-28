import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise01 {
  public void mainDraw(Graphics graphics){
    //  draw a red horizontal line to the canvas' middle.
    //  draw a green vertical line to the canvas' middle.
    

    graphics.setColor(Color.BLUE);
    graphics.drawLine(10,25,200,45);

    graphics.setColor(Color.RED);
    graphics.drawRect(10,55,(int)(Math.random() * 10),(int)(Math.random() * 20));

    graphics.setColor(Color.GREEN);
    graphics.fillOval(10,95,100,30);

    graphics.setColor(Color.ORANGE);
    graphics.fill3DRect(10,160,100,50,true);

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