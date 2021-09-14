import com.sun.deploy.net.MessageHeader;

import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleCalculator {
    public static void main(String[] args) {
        JPanel winoewContent = new JPanel();
        FlowLayout f1 = new FlowLayout();

        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        winoewContent.add(label1);
        winoewContent.add(field1);
        winoewContent.add(label2);
        winoewContent.add(field2);
        winoewContent.add(label3);
        winoewContent.add(result);
        winoewContent.add(go);

        JFrame frame = new JFrame("My First Calculator");
        frame.setContentPane(winoewContent);

        frame.setSize(400, 100);
        frame.setVisible(true);


    }
}