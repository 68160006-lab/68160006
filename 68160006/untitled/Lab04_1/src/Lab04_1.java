import javax.swing.*;
import java.awt.event.ActionEvent;
import java.lang.classfile.Label;
import java.awt.*;
import  java.awt.event.ActionListener;
public class Lab04_1 {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setTitle("Hello Progran: Ratchaphon Pengput 68160006 n03");
        f.setSize(500,300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel();
        label1.setText("Enter name : ");
        f.add(label1);

        JTextField nameBox = new JTextField(5);
        f.add(nameBox);

        JButton b1 = new JButton();
        b1.setText("Send");
        b1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String str = nameBox.getText();
                    JOptionPane.showMessageDialog(null,"Hello "+str);
        }
                });
        f.add(b1);

        f.setVisible(true);
    }
}
