import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends  JFrame {
  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("My Clock Program");
    this.setLayout(new FlowLayout());
    this.setSize(350,200);
    this.setResizable(false);
    this.setVisible(true);
  }
}
