package lab12;

class Student {
String id;
String name;
double gpa;

public Student(String id, String name, double gpa) {
this.id = id;
this.name = name;
this.gpa = gpa;
}

public void display() {
System.out.println("รหัส: " + id +
", ชื่อ: " + name +
", GPA: " + gpa);
}
}

