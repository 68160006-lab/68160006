import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class lab4_6 {
    public static void main(String[] args) {
        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        int ans = n1 * n2;
        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 500, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel subwin = new JPanel();
        subwin.setBackground(Color.cyan);
        subwin.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("" + n1);
        label1.setFont(new Font("Serif", Font.PLAIN, 40));

        JLabel label2 = new JLabel(" * ");
        label2.setFont(new Font("Serif", Font.PLAIN, 40));

        JLabel label3 = new JLabel("" + n2);
        label3.setFont(new Font("Serif", Font.PLAIN, 40));

        JLabel label4 = new JLabel(" = ");
        label4.setFont(new Font("Serif", Font.PLAIN, 40));
        JTextField txtAns = new JTextField(5);
        txtAns.setFont(new Font("Serif", Font.PLAIN, 30));

        JButton btn = new JButton("Check");
        JLabel result = new JLabel("");
        result.setFont(new Font("Serif", Font.BOLD, 30));
        result.setForeground(Color.BLUE);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userAns = Integer.parseInt(txtAns.getText());
                    if (userAns == ans) {
                        result.setText("Excellent!");
                    } else {
                        result.setText("Wrong!");
                    }
                } catch (NumberFormatException ex) {
                    result.setText("Enter Number!");
                }
            }
        });

        subwin.add(label1);
        subwin.add(label2);
        subwin.add(label3);
        subwin.add(label4);
        subwin.add(txtAns);
        subwin.add(btn);
        subwin.add(result);
        win.add(subwin);
        win.setVisible(true);
    }
}
