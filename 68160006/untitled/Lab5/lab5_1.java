import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab5_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI with Menu");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuCalculate = new JMenu("Calculate");
        JMenu menuOther = new JMenu("Others");

        JMenuItem itemAdd = new JMenuItem("Add");
        JMenuItem itemSub = new JMenuItem("Subtract");
        JMenuItem itemMultiply = new JMenuItem("Multiply");
        JMenuItem itemName = new JMenuItem("Greeting");
        JMenuItem itemExit = new JMenuItem("Quit");

        menuCalculate.add(itemAdd);
        menuCalculate.add(itemSub);
        menuCalculate.add(itemMultiply);
        menuOther.add(itemName);
        menuOther.addSeparator();
        menuOther.add(itemExit);

        menuBar.add(menuCalculate);
        menuBar.add(menuOther);
        frame.setJMenuBar(menuBar);


        itemAdd.addActionListener(e -> {
            calculate(frame, "+");
        });

        itemSub.addActionListener(e -> {
            calculate(frame, "-");
        });

        itemMultiply.addActionListener(e -> {
            calculate(frame, "*");
        });

        itemName.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(frame, "What is your name?");
            if (name != null) JOptionPane.showMessageDialog(frame, "Hello, " + name);
        });

        itemExit.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }

    private static void calculate(JFrame frame, String operator) {
        try {
            String input1 = JOptionPane.showInputDialog(frame, "Enter number #1");
            if (input1 == null) return;
            int a = Integer.parseInt(input1);

            String input2 = JOptionPane.showInputDialog(frame, "Enter number #2");
            if (input2 == null) return;
            int b = Integer.parseInt(input2);

            int result = 0;
            String opName = "";

            if (operator.equals("+")) {
                result = a + b;
                opName = "Sum";
            } else if (operator.equals("-")) {
                result = a - b;
                opName = "Difference";
            } else if (operator.equals("*")) {
                result = a * b;
                opName = "Product";
            }

            JOptionPane.showMessageDialog(frame, opName + " is: " + result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Error: Please enter only integers!");
        }
    }
}