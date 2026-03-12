package lab12;

import java.util.ArrayList;

public class ArrayListExample {
public static void main(String[] args) {

// สร้าง ArrayList สำหรับเก็บชื่อ
ArrayList<String> names = new ArrayList<>();

// เพิ่มข้อมูล
names.add("Somchai");
names.add("Suda");
names.add("Anan");

// แสดงข้อมูลทั้งหมด
System.out.println("รายชื่อทั้งหมด:");
for (String name : names) {
System.out.println(name);
}

// แก้ไขข้อมูลตำแหน่งที่ 1
names.set(1, "Malee");

// ลบข้อมูลตำแหน่งที่ 0
names.remove(0);

// แสดงข้อมูลใหม่
System.out.println("\nหลังจากแก้ไขข้อมูล:");
for (int i = 0; i < names.size(); i++) {
System.out.println(names.get(i));
}

// แสดงจำนวนสมาชิก
System.out.println("\nจำนวนสมาชิกทั้งหมด: " + names.size());
}
}
