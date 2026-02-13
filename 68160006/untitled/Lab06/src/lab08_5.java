import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab08_5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("แกลเลอรี่รูปภาพ");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        String[] images = {
                "D:\\Documents\\Downloads\\images.jpg",
                "D:\\Documents\\Downloads\\images(1).jpg",
                "D:\\Documents\\Downloads\\sub-buzz-8947-1717257505-1.jpg",
                "D:\\Documents\\Downloads\\a35145e.png"
        };
        for (String path : images) {
            ImageIcon icon = new ImageIcon(path);
            Image img = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            JLabel label = new JLabel(new ImageIcon(img));

            // เมื่อคลิกรูป
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    showLargeImage(path);
                }
            });

            panel.add(label);
        }

        frame.add(new JScrollPane(panel));
        frame.setVisible(true);
    }

    private static void showLargeImage(String path) {
        JFrame detailFrame = new JFrame("Image Viewer: " + path);
        JLabel label = new JLabel(new ImageIcon(path));
        detailFrame.add(new JScrollPane(label));
        detailFrame.pack();
        detailFrame.setLocationRelativeTo(null);
        detailFrame.setVisible(true);
    }
}