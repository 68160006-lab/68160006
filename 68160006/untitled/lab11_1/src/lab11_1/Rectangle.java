package lab11_1;

public class Rectangle {
    private int width;
    private int length;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (length * 2) + (width * 2);
    }
}
