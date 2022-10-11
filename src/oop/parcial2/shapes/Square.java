package oop.parcial2.shapes;

public class Square extends Shape {

    private final int side;

    public Square(int side){
        super("oop.parcial2.shapes.Square ■",4,side*4,side*side);
        this.side=side;
    }

    public int getSide() {
        return side;
    }

}
