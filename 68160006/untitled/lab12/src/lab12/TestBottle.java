package lab12;

public class TestBottle {
    public static void main(String[] args) {
        Bottle b1, b2;
        b1 = new Bottle(7, 0);
        b2 = new Bottle(10, 0);

        System.out.println("---------- Start ----------");
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");

        System.out.println("---- Step1 : Filled b2 ----");
        b2.filled();
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");

        System.out.println("---- Step2 : Pour b2 in b1 until b1 full ----");
        b2.pourUntilFull(b1);
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");

        System.out.println("---- Step3 : Pour all b1 ----");
        b1.pourAll();
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");

        System.out.println("---- Step4 : Pour all b2 in b1 ----");
        b2.pourAll(b1);
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");

        System.out.println("---- Step5 : Filled b2 ----");
        b2.filled();
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");

        System.out.println("---- Step6 : Pour b2 in b1 until b1 full ----");
        b2.pourUntilFull(b1);
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");

        System.out.println("There will be 6 liters of water in a 10-liter bottle.");
    }
}