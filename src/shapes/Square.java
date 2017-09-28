package shapes;

public class Square extends Rectangle{  //wan to extend to another class; may see an error until you create a constructor
    private int side; //only one argument

    public Square(int side){ //Constructor - Method that has the same name as class
//        super(length, width); replaces with side, side
        super(side, side); //referenced the other class in Rectangle
        this.side = side;
    }

    public int getArea(){
//        return this.side * this.side;
        return (int) Math.pow(this.side, 2);
    }

    public int getPerimeter(){
        return 4 * this.side;
    }

}
// Overide method overrides actions
// Overwriting