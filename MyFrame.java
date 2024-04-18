import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends  JFrame {

  Calendar calendar;
  SimpleDateFormat timeFormat;
  SimpleDateFormat dayFormat;
  JLabel timeLabel;
  JLabel dayLabel;
  String time;
  String day;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("My Clock Program");
    this.setLayout(new FlowLayout());
    this.setSize(350,200);
    this.setResizable(false);

    timeFormat = new SimpleDateFormat("hh:mm:ss a");
    dayFormat = new SimpleDateFormat("EEEE");


    timeLabel = new JLabel();
    timeLabel.setFont(new Font("Arial",Font.PLAIN,50));
    timeLabel.setForeground(new Color(0,76,153));
    timeLabel.setBackground(Color.BLACK);
    timeLabel.setOpaque(true);

    dayLabel = new JLabel();
    dayLabel.setFont(new Font("Monospaced",Font.PLAIN,50));
    dayLabel.setForeground(new Color(0,204,204));
    dayLabel.setBackground(Color.BLACK);
    dayLabel.setOpaque(true);

    this.add(timeLabel);
    this.add(dayLabel);
    this.setVisible(true);

    setTime();
  }
  public void setTime(){
    while(true){
      time = timeFormat.format(Calendar.getInstance().getTime());
      timeLabel.setText(time);

      day = dayFormat.format(Calendar.getInstance().getTime());
      dayLabel.setText(day);
      try {
        Thread.sleep(1000);

      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
