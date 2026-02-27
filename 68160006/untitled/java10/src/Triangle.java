package java10;
public class Triangle {
    int base;
    int height;
    Triangle() {
        base = 1;
        height = 1;
    }
    Triangle(int b, int h) {
        base = b;
        height = h;
    }
    double area() {
        return 1.0 / 2 * base * height;
    }
    void display() {
        System.out.println("Triangle: ");
        System.out.println("Base: " + base + " Height: " + height);
        System.out.println("Area =  " + area());
    }
}

