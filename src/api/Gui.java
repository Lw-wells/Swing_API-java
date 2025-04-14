package api;

import javax.swing.*; // Import Swing components
import java.awt.*; // Import layout managers

public class Gui {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        // Set a layout manager
        frame.setLayout(new FlowLayout());
        
        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
