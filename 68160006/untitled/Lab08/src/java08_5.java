package java08;

import java.util.Scanner;

public class java08_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, m, f, h, total;
        String firstname;
        String lastname;
        char grade;

        for (int i = 1; i <= 10; i++) {
            System.out.println("This program to compute grade. ");
            System.out.print("Enter Student ID : ");
            id = input.nextInt();
            
            System.out.print("Enter Student firstname : ");
            firstname = input.next();
            
            System.out.print("Enter Student lastname : ");
            lastname = input.next();
            
            System.out.print("Enter midterm[30] : ");
            m = input.nextInt();
            
            System.out.print("Enter final[30] : ");
            f = input.nextInt();
            
            System.out.print("Enter homework[40] : ");
            h = input.nextInt();
            
            total = m + f + h;
            
            if (total >= 80) {
                grade = 'A';
            } else if (total >= 70) {
                grade = 'B';
            } else if (total >= 60) {
                grade = 'C';
            } else if (total >= 50) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            
            System.out.println("-------------------- Grade Report --------------------");
            System.out.println("ID : " + id);
            System.out.println("Name : " + firstname + " " + lastname);
            System.out.println("Midterm : " + m);
            System.out.println("Final : " + f);
            System.out.println("Homework : " + h);
            System.out.println("------------------------------------------------------");
            System.out.println("Total : " + total);
            System.out.println("Grade : " + grade);
            System.out.println("------------------------------------------------------");
            System.out.println(); 
        }
        
        input.close(); 
    }
}