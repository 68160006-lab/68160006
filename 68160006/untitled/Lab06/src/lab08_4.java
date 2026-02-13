import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab08_4 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Button with Image");
        f.setSize(300, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        ImageIcon pic1 = new ImageIcon("D:\\Documents\\Downloads\\images.jpg");

        Image img = pic1.getImage();
        Image scaledImg = img.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);

        JButton b1 = new JButton(scaledIcon);
        b1.setPreferredSize(new Dimension(150, 150));

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame bigFrame = new JFrame("Big Image");
                bigFrame.setSize(600, 600);
                bigFrame.setLocationRelativeTo(null);

                JLabel label = new JLabel(pic1);
                label.setHorizontalAlignment(JLabel.CENTER);

                bigFrame.add(label);
                bigFrame.setVisible(true);
            }
        });

        f.setLayout(new FlowLayout());
        f.add(b1);

        f.setVisible(true);
    }
}
