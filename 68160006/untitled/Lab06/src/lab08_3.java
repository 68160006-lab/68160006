import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab08_3 {

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
                JOptionPane.showMessageDialog(f, "You click at the image!");
            }
        });

        f.setLayout(new FlowLayout());
        f.add(b1);

        f.setVisible(true);
    }
}
