import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class lab5_6 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Save File with JFileChooser");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemExit = new JMenuItem("Exit");

        menuFile.add(itemSave);
        menuFile.add(itemExit);
        menuBar.add(menuFile);
        frame.setJMenuBar(menuBar);

        // Text Area
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Save Action
        itemSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showSaveDialog(frame);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                        writer.write(textArea.getText());
                        JOptionPane.showMessageDialog(frame, "บันทึกไฟล์เรียบร้อย");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "เกิดข้อผิดพลาดในการบันทึกไฟล์");
                    }
                }
            }
        });

        // Exit Action
        itemExit.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}