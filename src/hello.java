import javax.swing.*;
import java.io.*;
public class hello {
    public static void main(String[] args) {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\68160006\\number.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] nums = line.trim().split("\\s+");
                for (String n : nums) {
                    if (!n.isEmpty()) {
                        sum += Integer.parseInt(n);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return;
        }
        JOptionPane.showMessageDialog(null, sum);
    }
}


