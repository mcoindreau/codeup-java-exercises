package shapes;

public class Rectangle extends Quadrilateral implements Measurable { //no need for main method so STATIC not needed

    public Rectangle(double length, double width){ //constructor; think about where this info is going to be used, probably not going to use in this page
        super(length, width);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getArea(){   //method - don't need this. but recommend it

        return this.length * this.width;
    }

    public double getPerimeter(){  //method

        return 2 * length + 2 * width;
    }


}
