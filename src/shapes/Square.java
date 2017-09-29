package shapes;

public class Square extends Quadralateral implements Measurable{  //wan to extend to another class; may see an error until you create a constructor
    private double side; //only one argument

    public Square(double side){ //Constructor - Method that has the same name as class
//        super(length, width); replaces with side, side
        super(side, side); //referenced the other class in Rectangle
        this.side = side;
    }

    public double getArea(){
//        return this.side * this.side;
        return (int) Math.pow(this.side, 2);
    }

    public double getPerimeter(){
        return 4 * this.side;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}
// Overide method overrides actions
// Overwriting