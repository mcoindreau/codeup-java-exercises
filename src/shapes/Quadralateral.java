package shapes;

abstract class Quadralateral extends Shape implements Measurable { //create an abstract Quadralateral class that extends Shape and implements Measurable
    protected double length;
    protected double width;


    //a constructor that accepts two numbers for the length and width and sets those properties
    public Quadralateral(double length, double width) {
        this.length = length;
        this.width = width;
    }


//methods for getting the length and width


    //abstract methods for setting the length and width
    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}