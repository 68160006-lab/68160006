package java08;

import java.util.Scanner;

public class java08_3 {
    public static void main(String[] args) {
        Scanner nb = new Scanner(System.in);
        
        int[] id = new int[2];
        String[] name = new String[2];
        int[] mid = new int[2];
        int[] fnl = new int[2];
        int[] hw = new int[2];
        int[] total = new int[2];
        char[] grade = new char[2];

        for (int i = 0; i < 2; i++) {
            System.out.println(">>> กรอกข้อมูลนิสิตคนที่ " + (i + 1) + " <<<");
            System.out.print("Enter Student ID: ");
            id[i] = nb.nextInt();
            System.out.print("Enter First Name : ");
            String fname = nb.next();
            System.out.print("Enter Last Name: ");
            String lname = nb.next();
            name[i] = fname + " " + lname;
            
            System.out.print("Enter Midterm [30]: ");
            mid[i] = nb.nextInt();
            System.out.print("Enter Final [30]: ");
            fnl[i] = nb.nextInt();
            System.out.print("Enter Homework [40]: ");
            hw[i] = nb.nextInt();
            
            total[i] = mid[i] + fnl[i] + hw[i];

            if (total[i] >= 80) grade[i] = 'A';
            else if (total[i] >= 70) grade[i] = 'B';
            else if (total[i] >= 60) grade[i] = 'C';
            else if (total[i] >= 50) grade[i] = 'D';
            else grade[i] = 'F';
            
            System.out.println(); 
        }

        System.out.println("================================");
        System.out.println("       STUDENT GRADE REPORT     ");
        System.out.println("================================");
        for (int i = 0; i < 2; i++) {
            System.out.println("ID: " + id[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Total Score: " + total[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("--------------------------------");
        }
        
        nb.close();
    }
}