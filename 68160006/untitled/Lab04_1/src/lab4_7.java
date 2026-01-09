import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class lab4_7 {
    static int n1, n2, ans;
    static int score = 0;
    static int count = 0;
    static final int MAX_QUESTIONS = 10;

    public static void main(String[] args) {
        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 650, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel subwin = new JPanel();
        subwin.setBackground(new Color(102, 224, 255));
        subwin.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));

        JLabel lblN1 = new JLabel();
        JLabel lblOp = new JLabel(" - ");
        JLabel lblN2 = new JLabel();
        JLabel lblEq = new JLabel(" = ");

        Font mainFont = new Font("Serif", Font.PLAIN, 50);
        lblN1.setFont(mainFont);
        lblOp.setFont(mainFont);
        lblN2.setFont(mainFont);
        lblEq.setFont(mainFont);

        JTextField txtAns = new JTextField(3);
        txtAns.setFont(new Font("Serif", Font.PLAIN, 40));

        JButton btn = new JButton("Check");
        btn.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel lblScoreBoard = new JLabel("Score: 0 / " + MAX_QUESTIONS);
        lblScoreBoard.setFont(new Font("Serif", Font.PLAIN, 30));

        generateQuestion(lblN1, lblN2);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userAns = Integer.parseInt(txtAns.getText());
                    count++;


                    if (userAns == ans) {
                        score++;
                    }

                    lblScoreBoard.setText("Score: " + score + " / " + MAX_QUESTIONS);
                    txtAns.setText("");

                    if (count >= MAX_QUESTIONS) {
                        JOptionPane.showMessageDialog(win, "Finished! \nYour total score: " + score + " / 10");

                        score = 0;
                        count = 0;
                        lblScoreBoard.setText("Score: 0 / " + MAX_QUESTIONS);
                    }

                    generateQuestion(lblN1, lblN2);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(win, "Please enter a valid number!");
                }
            }
        });

        subwin.add(lblN1);
        subwin.add(lblOp);
        subwin.add(lblN2);
        subwin.add(lblEq);
        subwin.add(txtAns);
        subwin.add(btn);
        subwin.add(lblScoreBoard);

        win.add(subwin);
        win.setVisible(true);
    }

    public static void generateQuestion(JLabel l1, JLabel l2) {
        n1 = (int)(Math.random() * 10);
        n2 = (int)(Math.random() * 10);
        ans = n1 - n2;
        l1.setText("" + n1);
        l2.setText("" + n2);
    }
}