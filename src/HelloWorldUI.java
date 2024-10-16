import java.awt.*;
import javax.swing.*;

public class HelloWorldUI extends JFrame {
    public HelloWorldUI(String message) {
        setTitle("Hello World App");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        MessagePanel panel = new MessagePanel(message);
        add(panel);

        setVisible(true);
    }

    private static class MessagePanel extends JPanel {
        private final String message;

        public MessagePanel(String message) {
            this.message = message;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setFont(new Font("Arial", Font.BOLD, 16));
            g.setColor(Color.BLACK);
            g.drawString(message, 50, 50); // Adjust position as needed
        }
    }
}
