package java10;
public class Rectangle {
    int length;
    int width;
    Rectangle() {
        length = 1;
        width = 1;
    }
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    int area() {
        return length * width;
    }
    int perimeter() {
        return (length*2) + (width*2);
    }
    void display() {
        System.out.println("Rectangle " + length + " x " + width);
        System.out.println("Area =  " + area());
        System.out.println("Perimeter =  " + perimeter());
    }
}

