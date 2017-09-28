package shapes;

public class Rectangle { //no need for main method so STATIC not needed

    private int length; //only accessible from this class
    private int width;

    public Rectangle(int length, int width){ //constructor; think about where this info is going to be used, probably not going to use in this page
        this.length = length;
        this.width = width;
    }

    public int getArea(){ //method
        return this.length * this.width;
    }

    public int getPerimeter(){//method
        return 2 * length + 2 * width;
    }

}
