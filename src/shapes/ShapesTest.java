package shapes;

public class ShapesTest {

    public static void main(String[] args) {
    
        Rectangle box1 = new Rectangle(4, 5);

        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
        System.out.println("box1 = " + box1.getArea() + "\n");

        Rectangle box2 = new Square(5); //data type looking for is superclass on left side

        System.out.println("box2 = " + box2.getPerimeter());
        System.out.println("box2.getArea() = " + box2.getArea());
    }
}
