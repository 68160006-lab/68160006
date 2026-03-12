package lab12;

import java.util.ArrayList;

public class StudentManagement {
public static void main(String[] args) {

ArrayList<Student> students = new ArrayList<>();

// เพิ่มนักศึกษา
students.add(new Student("001", "Somchai", 3.50));
students.add(new Student("002", "Suda", 3.80));
students.add(new Student("003", "Anan", 2.90));

// แสดงข้อมูลนักศึกษาทั้งหมด
System.out.println("ข้อมูลนักศึกษาทั้งหมด:");
for (Student s : students) {
s.display();
}

// ค้นหานักศึกษาที่ GPA มากกว่า 3.00
System.out.println("\nรายชื่อนักศึกษาที่ GPA มากกว่า 3.00");
for (Student s : students) {
if (s.gpa > 3.00) {
s.display();
}
}
}
}
