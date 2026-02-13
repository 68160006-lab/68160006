import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab08_6 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("แกลเลอรี่รูปภาพ (แบบปุ่ม)");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // จัดวางเรียงจากซ้าย

        String[] images = {
                "D:\\Documents\\Downloads\\images.jpg",
                "D:\\Documents\\Downloads\\images(1).jpg",
                "D:\\Documents\\Downloads\\sub-buzz-8947-1717257505-1.jpg",
                "D:\\Documents\\Downloads\\a35145e.png"
        };

        for (String path : images) {
            ImageIcon icon = new ImageIcon(path);
            Image img = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);

            JButton button = new JButton(new ImageIcon(img));

            button.setPreferredSize(new Dimension(130, 130));
            button.setFocusPainted(false);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showLargeImage(path);
                }
            });

            panel.add(button);
        }

        frame.add(new JScrollPane(panel));
        frame.setVisible(true);
    }

    private static void showLargeImage(String path) {
        JFrame detailFrame = new JFrame("แสดงรูปภาพ: " + path);
        JLabel label = new JLabel(new ImageIcon(path));
        detailFrame.add(new JScrollPane(label));
        detailFrame.pack();
        detailFrame.setLocationRelativeTo(null);
        detailFrame.setVisible(true);
    }
}