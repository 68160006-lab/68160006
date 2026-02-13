import javax.swing.*;
import java.awt.*;

public class lab08_2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Show picture on Label");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon ima = new ImageIcon("D:\\Documents\\Downloads\\images(1).jpg");
        Image img = ima.getImage().getScaledInstance(400, 260, Image.SCALE_SMOOTH);

        JLabel label = new JLabel(new ImageIcon(img));
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}

