package lab11_1;

public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        
        r1.setLength(4);
        r1.setWidth(6);

        System.out.println("Rectangle: length = " + r1.getLength() + " width = " + r1.getWidth());
        System.out.println("area = " + r1.getArea());
        System.out.println("perimeter = " + r1.getPerimeter());
    }
}
