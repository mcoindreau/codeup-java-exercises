package shapes;

public class Square extends Rectangle{
    private int side;

    public Square(int side){
        super(side, side);
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
