package revision1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fun extends JFrame {
    
    private int size = 50; // Initial size of the heart
    private boolean growing = true; // Direction of the heart size change
    
    public fun() {
        // Set up the window properties
        setTitle("Heart Animation for You 💖");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window
        
        // Timer to trigger animation every 30 milliseconds
        Timer timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the heart size
                if (growing) {
                    size += 2;
                    if (size > 100) growing = false; // Stop growing
                } else {
                    size -= 2;
                    if (size < 50) growing = true; // Stop shrinking
                }
                repaint(); // Redraw the heart every time it changes
            }
        });
        timer.start(); // Start the animation timer
        
        // Add mouse listener to change the message on click
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "You make my heart beat faster. 😊");
            }
        });
    }

    // Method to draw the heart shape
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Set the background color and draw a white background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Set the heart color
        g.setColor(Color.RED);
        
        // Draw a heart shape at the center of the window
        g.fillArc(150, 100, size, size, 0, 180); // Left top
        g.fillArc(200, 100, size, size, 0, 180); // Right top
        g.fillPolygon(new int[]{150, 250, 300}, new int[]{150, 300, 150}, 3); // Bottom triangle

        // Draw the message
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("You have my heart! 💖", 120, 50);
    }

    // Main method to run the program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create and show the Heart Animation App window
                new fun().setVisible(true);
            }
        });
    }
}
