package eventAndGui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test {
    public static void main(String[] args) {
        Frame frame = new Frame("event test");

       frame.setSize(300,200);
       frame.setVisible(true);
       frame.setLayout(new FlowLayout());
        Panel panel = new Panel();
        Button button = new Button("click me");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("closed");
                frame.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        button.addMouseListener(new MouseAdapter(){
            public void MouseClicked(MouseEvent e){
                System.out.println("mouse clicked");

            }
        });
        frame.add(panel);
        panel.setSize(200,100);
    }

}
