package oop.parcial2.shapes;

public class Rectangle extends Shape {
    private final int base;
    private final int height;

    public Rectangle(int base,int height){
        super("oop.parcial2.shapes.Rectangle █",4,(base*2)+(height*2),base*height);
        this.base=base;
        this.height=height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
}
