package UseSwing;
import javax.swing.*;
import java.awt.*;

public class Swingtest {
    public static void main(String[] args) {
        // JFrame - A top-level container that represents a window
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel - A generic lightweight container
        JPanel panel = new JPanel();
        frame.add(panel);

        // JButton - A button component
        JButton button = new JButton("Click me");
        panel.add(button);

        // JLabel - A component that displays text
        JLabel label = new JLabel("Hello, Swing!");
        panel.add(label);

        // JCheckBox - A component that represents a checkbox
        JCheckBox checkBox = new JCheckBox("Check me");
        panel.add(checkBox);

        // JRadioButton - A component that represents a radio button
        JRadioButton radioButton = new JRadioButton("Select me");
        panel.add(radioButton);

        // JTextField - A text input component
        JTextField textField = new JTextField(10);
        panel.add(textField);

        // JTextArea - A multi-line text area component
        JTextArea textArea = new JTextArea(5, 20);
        panel.add(textArea);

        // JComboBox - A drop-down list component
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        panel.add(comboBox);

        // Container - A lightweight container that can hold and manage other components
        Container container = new Container();
        container.setLayout(new FlowLayout());
        container.add(new JLabel("Container Example"));
        container.add(new JButton("Button 1"));
        container.add(new JButton("Button 2"));
        panel.add(container);

        // JDialog - A top-level container that represents a dialog box
        JDialog dialog = new JDialog(frame, "Dialog Example", true);
        dialog.setSize(300, 200);
        dialog.setLayout(new FlowLayout());
        dialog.add(new JLabel("This is a dialog"));
        dialog.add(new JButton("OK"));
        dialog.add(new JButton("Cancel"));
       // dialog.setVisible(true);

        frame.setVisible(true);
    }
}

