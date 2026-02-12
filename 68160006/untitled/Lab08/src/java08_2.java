package java08;

import java.util.Scanner;
public class java08_2 {
    int id;
    String firstname;
    String lastname;
    int mid;
    int fnl;
    int hw;
    int score;
    char grade;
      public void readData() {
        Scanner nb = new Scanner(System.in);        
        System.out.print("Enter Your id student : ");
        id = nb.nextInt();        
        System.out.print("Enter First Name : ");
        firstname = nb.next();        
        System.out.print("Enter Last Name : ");
        lastname = nb.next();       
        System.out.print("Enter Midterm[30] : ");
        mid = nb.nextInt();        
        System.out.print("Enter final[30] : ");
        fnl = nb.nextInt();       
        System.out.print("Enter Home work[40] : ");
        hw = nb.nextInt();
        score = mid + fnl + hw;
    }
    public void computgrade() {
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
    public void showReport() {
        System.out.println("-----Grade Report-----");
        System.out.println("ID : " + id);
        System.out.println("Name : " + firstname + " " + lastname);
        System.out.println("MID : " + mid);
        System.out.println("Final : " + fnl);
        System.out.println("Homework : " + hw);
        System.out.println("----------Your Grade----------");
        System.out.println("Total : " + score);
        System.out.println("Grade : " + grade);
    }
    public static void main(String[] args) {
        java08_2 student = new java08_2();
        student.readData();
        student.computgrade();
        student.showReport();
    }
}

