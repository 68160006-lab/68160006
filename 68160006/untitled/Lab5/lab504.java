import javax.swing.*;
import java.awt.*;
import java.io.*;

public class lab504 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("lab504 : JTextArea Program");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ===== Text Area =====
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // ===== Buttons =====
        JButton btnSave = new JButton("Save");
        JButton btnShow = new JButton("Show message");

        JPanel panel = new JPanel();
        panel.add(btnSave);
        panel.add(btnShow);
        frame.add(panel, BorderLayout.SOUTH);

        // ===== Save Button =====
        btnSave.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showSaveDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(textArea.getText());
                    JOptionPane.showMessageDialog(frame, "บันทึกไฟล์เรียบร้อย");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "เกิดข้อผิดพลาดในการบันทึกไฟล์");
                }
            }
        });

        // ===== Show Message Button =====
        btnShow.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    frame,
                    textArea.getText(),
                    "ข้อความที่พิมพ์",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        frame.setVisible(true);
    }
}
