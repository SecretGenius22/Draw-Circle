import javax.swing.*;
import java.awt.*;

public class draw extends JFrame {

    public draw(){
        setTitle("Drawing a Circle");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(150, 150, 100, 100);

    }

    public static void main(String[] args) {

       new draw();

    }
}

