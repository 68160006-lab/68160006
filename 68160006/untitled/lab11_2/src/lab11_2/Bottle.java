package lab11_2;

public class Bottle {
    int capacity;
    int waterVolume;

    public Bottle(int capacity, int waterVolume) {
        this.capacity = capacity;
        this.waterVolume = waterVolume;
    }

    public void filled() {
        waterVolume = capacity;
    }

    public void pourAll(Bottle b) {
        int spaceLeft = b.capacity - b.waterVolume;
        if (this.waterVolume <= spaceLeft) {
            b.waterVolume += this.waterVolume;
            this.waterVolume = 0;
        } else {
            // กรณีเทลงไปแล้วขวดเต็มพอดีหรือเกิน
            this.waterVolume -= spaceLeft;
            b.waterVolume = b.capacity;
        }
    }

    public void pourAll() {
        waterVolume = 0;
    }

    public void pourUntilFull(Bottle b) {
        int spaceLeft = b.capacity - b.waterVolume;
        if (this.waterVolume >= spaceLeft) {
            this.waterVolume -= spaceLeft;
            b.waterVolume = b.capacity;
        }
    }

    public void showInfo() {
        System.out.println("Bottle: " + capacity + "L, Water: " + waterVolume + "L");
    }
}
