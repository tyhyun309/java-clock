import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends  JFrame {

  Calendar calendar;
  SimpleDateFormat timeFormat;
  JLabel timeLabel;
  String time;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("My Clock Program");
    this.setLayout(new FlowLayout());
    this.setSize(350,200);
    this.setResizable(false);

    timeFormat = new SimpleDateFormat("hh:mm:ss a");
    timeLabel = new JLabel();
    time = timeFormat.format(Calendar.getInstance().getTime());
    timeLabel.setText(time);

    this.add(timeLabel);
    this.setVisible(true);
  }
}
