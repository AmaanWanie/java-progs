package GUI;
import javax.swing.*;
import java.awt.*;


public class GUI {
    public static void main(String[] args) {
        Frame frame = new Frame("MY FRAME");
        Panel panel = new Panel();
        panel.setBackground(Color.GREEN);
        panel.setSize(100,70);
        panel.setVisible(true);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(new Button("button 1"));
        panel.add(new Checkbox("check1"));
        panel.add(new TextField());
        panel.add(new TextArea());
        panel.add(new Label("amaan"));
        panel.add(new List(4));

  String[] combo= {"item1","item2"};
       panel.add(new JComboBox<>(combo));



        frame.setSize(500,700);
        frame.add(panel);
        frame.setVisible(true);

    }
}
