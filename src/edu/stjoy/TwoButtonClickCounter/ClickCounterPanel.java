package edu.stjoy.TwoButtonClickCounter;





//import javafx.scene.layout.BorderPane;

import javax.swing.*;
import javax.swing.plaf.ButtonUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
//import java.applet.Applet;





public class ClickCounterPanel extends JPanel {

    private int counter;

    private JButton push;
    private JButton push1;
    private JButton label;
    private JButton reset;
   // private JButton refresh;


    public ClickCounterPanel() {

        setLayout(new BorderLayout());

        counter = 0;
        push = new JButton("Click this Button: INCREMENT");

        push.setForeground(Color.BLUE);
        push.setBackground(Color.BLUE);push.setOpaque(true);
        push.setFont(new Font("Serif", Font.BOLD, 16));

        push1 = new JButton("Click this Button: DECREMENT");
        push1.setForeground(Color.BLUE);
        push1.setBackground(Color.BLUE);push1.setOpaque(true);
        push1.setFont(new Font("Serif", Font.BOLD, 16));

        reset=new JButton("Press Here TO RESET TO 0");
        reset.setForeground(Color.BLACK);
        reset.setBackground(Color.BLACK);reset.setOpaque(true);
        reset.setFont(new Font("Serif", Font.BOLD, 20));


        label = new JButton("Clicks: " + counter);
        label.setForeground(Color.RED);
        label.setBackground(Color.RED);label.setOpaque(true);
        label.setFont(new Font("Serif", Font.BOLD, 30));

        //refresh=new JButton("Click here to reload JPanel");
        push.addActionListener(new ButtonListener());
        push1.addActionListener(new ButtonListener1());
        reset.addActionListener(new ButtonListener2());
        //refresh.addActionListener(new ButtonListener3());
        add(push,"West");
        add(label,"Center");
        add(push1,"East");
        add(reset,"North");
        //add(refresh);
        setSize(900,300);
        setBackground(Color.WHITE);

    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           counter++;
           label.setText("Clicks: " + counter);
          }
      }

      private class ButtonListener1 implements ActionListener {
          public void actionPerformed(ActionEvent event) {
              counter--;
              label.setText("Clicks:" + counter);
        }

      }

      private class ButtonListener2 implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e) {
              counter=0;
              label.setText("Clicks: "+ counter);
          }
      }

/*private class ButtonListener3 implements ActionListener{

        @Override
    public void actionPerformed(ActionEvent event){
            label.setText("Clicks: " + reset);
        }
}*/





            public static void main(String[] args) {
            JFrame frame = new JFrame("Two Button Click Counter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new ClickCounterPanel());
            frame.pack();
            frame.setVisible(true);
            frame.setSize(900,200);


        }
    }





