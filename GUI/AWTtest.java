package GUI;
import java.awt.*;

public class AWTtest {
    public static void main(String[] args) {
        // Frame - A top-level container that represents a window
        Frame frame = new Frame("AWT Example");
        frame.setSize(400, 300);

        // Panel - A generic lightweight container
        Panel panel = new Panel();
        frame.add(panel);

        // Button - A button component
        Button button = new Button("Click me");
        panel.add(button);

        // Label - A component that displays text
        Label label = new Label("Hello, AWT!");
        panel.add(label);

        // Checkbox - A component that represents a checkbox
        Checkbox checkbox = new Checkbox("Check me");
        panel.add(checkbox);

        // CheckboxGroup - A group of checkboxes
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Option 1", checkboxGroup, false);
        Checkbox checkbox2 = new Checkbox("Option 2", checkboxGroup, true);
        panel.add(checkbox1);
        panel.add(checkbox2);

        // TextField - A text input component
        TextField textField = new TextField(10);
        panel.add(textField);

        // TextArea - A multi-line text area component
        TextArea textArea = new TextArea(5, 20);
        panel.add(textArea);

        // Choice - A drop-down list component
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        panel.add(choice);

        // Container - A lightweight container that can hold and manage other components
        Container container = new Container();
        container.setLayout(new FlowLayout());
        container.add(new Label("Container Example"));
        container.add(new Button("Button 1"));
        container.add(new Button("Button 2"));
        panel.add(container);

        // JDialog - A top-level container that represents a dialog box
        Dialog dialog = new Dialog(frame, "Dialog Example", true);
        dialog.setSize(300, 200);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label("This is a dialog"));
        dialog.add(new Button("OK"));
        dialog.add(new Button("Cancel"));
        dialog.setVisible(true);

        frame.setVisible(true);
    }
    }

