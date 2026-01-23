import javax.swing.*;
import java.awt.*;
import java.io.*;

public class lab5_8 extends JFrame {

    private JTextArea textArea;
    private File currentFile;

    public lab5_8() {
        setTitle("Simple Text Editor");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        createMenuBar();
        setVisible(true);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem saveAsItem = new JMenuItem("Save As");
        JMenuItem exitItem = new JMenuItem("Exit");

        // New
        newItem.addActionListener(e -> {
            textArea.setText("");
            currentFile = null;
        });

        // Open
        openItem.addActionListener(e -> openFile());

        // Save
        saveItem.addActionListener(e -> saveFile());

        // Save As
        saveAsItem.addActionListener(e -> saveFileAs());

        // Exit
        exitItem.addActionListener(e -> System.exit(0));

        menuFile.add(newItem);
        menuFile.add(openItem);
        menuFile.add(saveItem);
        menuFile.add(saveAsItem);
        menuFile.addSeparator();
        menuFile.add(exitItem);

        menuBar.add(menuFile);
        setJMenuBar(menuBar);
    }

    private void openFile() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = chooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(currentFile))) {
                textArea.read(br, null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Cannot open file",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFile() {
        if (currentFile == null) {
            saveFileAs();
            return;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(currentFile))) {
            textArea.write(bw);
            JOptionPane.showMessageDialog(this, "Save successful");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Cannot save file",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveFileAs() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = chooser.getSelectedFile();
            saveFile();
        }
    }

    public static void main(String[] args) {
        new lab5_8();
    }
}
