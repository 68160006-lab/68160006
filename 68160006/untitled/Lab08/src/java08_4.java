package java08;

public class java08_4 {
    private int id;
    private String name;
    private int mid, fnl, hw;

    public Student(int id, String name, int mid, int fnl, int hw) {
        this.id = id;
        this.name = name;
        this.mid = mid;
        this.fnl = fnl;
        this.hw = hw;
    }

    public int getTotalScore() {
        return mid + fnl + hw;
    }

    public char getGrade() {
        int total = getTotalScore();
        if (total >= 80) return 'A';
        if (total >= 70) return 'B';
        if (total >= 60) return 'C';
        if (total >= 50) return 'D';
        return 'F';
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Score: " + getTotalScore());
        System.out.println("Grade: " + getGrade());
        System.out.println("--------------------------------");
    }
}