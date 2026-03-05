package lab11_2;

public class TestBottle {
    public static void main(String[] args) {
        Bottle b3 = new Bottle(3, 0);
        Bottle b5 = new Bottle(5, 0);

        System.out.println("เริ่มต้น: ขวด 3L และ 5L ว่างเปล่า");

        // ขั้นตอนที่ 1: เติมน้ำเต็มขวด 3 ลิตร
        System.out.println("\n1. เติมน้ำเต็มขวด 3 ลิตร:");
        b3.filled();
        printStatus(b3, b5);

        // ขั้นตอนที่ 2: เทน้ำจากขวด 3 ลิตร ไปขวด 5 ลิตร
        System.out.println("2. เทน้ำจากขวด 3 ลิตร ลงขวด 5 ลิตร:");
        b3.pourAll(b5);
        printStatus(b3, b5);

        // ขั้นตอนที่ 3: เติมน้ำเต็มขวด 3 ลิตร
        System.out.println("3. เติมน้ำเต็มขวด 3 ลิตร:");
        b3.filled();
        printStatus(b3, b5);

        // ขั้นตอนที่ 4: เทน้ำจากขวด 3 ลิตร ไปขวด 5 ลิตรจนเต็ม
        System.out.println("4. เทน้ำจากขวด 3 ลิตร ลงขวด 5 ลิตรจนเต็ม:");
        b3.pourUntilFull(b5);
        printStatus(b3, b5);
    }

    public static void printStatus(Bottle b3, Bottle b5) {
        System.out.print("   [สถานะ] ");
        b3.showInfo();
        System.out.print("           ");
        b5.showInfo();
    }
}