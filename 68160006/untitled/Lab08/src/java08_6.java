package java08;

import java.util.Scanner;

class Student {
 private int id;
 private String firstName;
 private String lastName;
 private int midterm;
 private int fin;
 private int homework;
 private int total;
 private char grade;

 public Student(int id, String firstName, String lastName, int midterm, int fin, int homework) {
     this.id = id;
     this.firstName = firstName;
     this.lastName = lastName;
     this.midterm = midterm;
     this.fin = fin;
     this.homework = homework;
     calculateGrade();
 }

 private void calculateGrade() {
     this.total = midterm + fin + homework;
     if (total >= 80) grade = 'A';
     else if (total >= 70) grade = 'B';
     else if (total >= 60) grade = 'C';
     else if (total >= 50) grade = 'D';
     else grade = 'F';
 }

 public void displayReport() {
     System.out.println("-------------------- Grade Report --------------------");
     System.out.println("ID : " + id);
     System.out.println("Name : " + firstName + " " + lastName);
     System.out.println("Midterm : " + midterm);
     System.out.println("Final : " + fin);
     System.out.println("Homework : " + homework);
     System.out.println("------------------------------------------------------");
     System.out.println("Total : " + total);
     System.out.println("Grade : " + grade);
     System.out.println("------------------------------------------------------\n");
 }
}

public class java08_5 {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     for (int i = 1; i <= 10; i++) {
         System.out.println("Student #" + i + " - Compute Grade");
         
         System.out.print("Enter Student ID : ");
         int id = input.nextInt();
         
         System.out.print("Enter Student firstname : ");
         String fname = input.next();
         
         System.out.print("Enter Student lastname : ");
         String lname = input.next();
         
         System.out.print("Enter midterm[30] : ");
         int m = input.nextInt();
         
         System.out.print("Enter final[30] : ");
         int f = input.nextInt();
         
         System.out.print("Enter homework[40] : ");
         int h = input.nextInt();

         Student std = new Student(id, fname, lname, m, f, h);
         
         std.displayReport();
     }
     input.close();
 }
}