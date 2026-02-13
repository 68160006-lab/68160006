import javax.swing.*;

public class lab08_1 {
    public static void main(String[] args){
        JFrame frame = new JFrame("แสดงรูปภาพบน JLabel");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("D:\\Documents\\Downloads\\images.jpg");
        JLabel label = new JLabel(icon);
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}

