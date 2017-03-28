import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DrawingBasics extends JPanel{
  public void paintComponent (Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.WHITE);

    g.setColor(Color.BLUE);
    g.fillRect(25,25,100,30);
  }

}
