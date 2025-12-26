import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab04_4 {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setTitle("Grade Calculator : Ratchaphon Pengput 68160006 n03");
        f.setSize(500,300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lMid = new JLabel();
        JTextField tMid = new JTextField(5);

        JLabel lFin = new JLabel();
        JTextField tFin = new JTextField(5);

        JLabel lHw = new JLabel();
        JTextField tHw = new JTextField(5);

        JLabel result = new JLabel();

        JButton b1 = new JButton("Grade");

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    double mid = Double.parseDouble(tMid.getText());
                    double fin = Double.parseDouble(tFin.getText());
                    double hw  = Double.parseDouble(tHw.getText());

                    double total = mid + fin + hw;
                    char grade;

                    if(total >= 80)
                        grade = 'A';
                    else if (total >= 70)
                        grade = 'B';
                    else if (total >= 60)
                        grade = 'C';
                    else if (total >= 50)
                        grade = 'D';
                    else
                        grade = 'F';

                    result.setText(""+grade);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f,
                            "Please enter numbers only",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        f.add(lMid); f.add(tMid);
        f.add(lFin); f.add(tFin);
        f.add(lHw);  f.add(tHw);
        f.add(b1);
        f.add(result);

        f.setVisible(true);
    }
}

