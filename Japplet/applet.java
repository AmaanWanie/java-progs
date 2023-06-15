package Japplet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class applet extends JApplet implements ActionListener {

   public void init(){

       JFrame frame = new JFrame("amaan");
       JPanel panel= new JPanel();
      JButton button = new JButton("click");
      JLabel label = new JLabel("enter name");
      JTextField field = new JTextField(10);
      button.addActionListener(this::actionPerformed);
      panel.add(button);
      panel.add(label);
      panel.add(field);
      frame.add(panel);
      frame.setVisible(true);
      add(panel);
   }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==new Button("click me")){



        }
    }public static void main(String[] args) {

    }
}

