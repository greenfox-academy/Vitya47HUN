import javax.swing.*;
public class Window {
  public static void main(String[] args) {

      JFrame f = new JFrame("Title");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      DrawingBasics p = new DrawingBasics();
      f.add(p);
      f.setSize(400,250);
      f.setVisible(true);
  }
}
