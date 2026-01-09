import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab4_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 20));
        frame.getContentPane().setBackground(new Color(230, 242, 255));

        JLabel lblWeight = new JLabel("  Weight (kg):", SwingConstants.LEFT);
        lblWeight.setFont(new Font("Serif", Font.PLAIN, 20));
        JTextField txtWeight = new JTextField();
        txtWeight.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel lblHeight = new JLabel("  Height (cm):", SwingConstants.LEFT);
        lblHeight.setFont(new Font("Serif", Font.PLAIN, 20));
        JTextField txtHeight = new JTextField();
        txtHeight.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel lblBMIText = new JLabel("  BMI:", SwingConstants.LEFT);
        lblBMIText.setFont(new Font("Serif", Font.PLAIN, 20));
        JLabel lblBMIValue = new JLabel("");
        lblBMIValue.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel lblResultText = new JLabel("  Result:", SwingConstants.LEFT);
        lblResultText.setFont(new Font("Serif", Font.PLAIN, 20));
        JLabel lblResultValue = new JLabel("");
        lblResultValue.setFont(new Font("Serif", Font.BOLD, 20));
        lblResultValue.setForeground(Color.ORANGE); 

        JButton btnCalculate = new JButton("Calculate BMI");
        btnCalculate.setFont(new Font("Serif", Font.PLAIN, 18));

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(txtWeight.getText());
                    double heightCm = Double.parseDouble(txtHeight.getText());
                    double heightM = heightCm / 100; // แปลงเซนติเมตรเป็นเมตร

                    double bmi = weight / (heightM * heightM);
                    lblBMIValue.setText(String.format("%.2f", bmi));

                    if (bmi < 18.5) {
                        lblResultValue.setText("Underweight");
                        lblResultValue.setForeground(Color.BLUE);
                    } else if (bmi < 25) {
                        lblResultValue.setText("Normal");
                        lblResultValue.setForeground(new Color(0, 153, 0)); // สีเขียว
                    } else {
                        lblResultValue.setText("Overweight");
                        lblResultValue.setForeground(Color.ORANGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                }
            }
        });

        frame.add(lblWeight);
        frame.add(txtWeight);
        frame.add(lblHeight);
        frame.add(txtHeight);
        frame.add(lblBMIText);
        frame.add(lblBMIValue);
        frame.add(lblResultText);
        frame.add(lblResultValue);
        frame.add(new JLabel(""));
        frame.add(btnCalculate);

        frame.setVisible(true);
    }
}