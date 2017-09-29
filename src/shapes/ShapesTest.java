package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable box1 = new Rectangle(4, 5);

        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
        System.out.println("box1 = " + box1.getArea() + "\n");

        Measurable box2 = new Square(5);

        System.out.println("box2 = " + box2.getPerimeter());
        System.out.println("box2.getArea() = " + box2.getArea() + "\n\n");

        Measurable myShape = new Rectangle(4, 5);

        System.out.println("myShapeRectangle.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShapeRectangle = " + myShape.getArea() + "\n");

        myShape = new Square(5);

        System.out.println("myShape2 Square = " + myShape.getPerimeter());
        System.out.println("myShape2Square.getArea() = " + myShape.getArea());
    }


}
