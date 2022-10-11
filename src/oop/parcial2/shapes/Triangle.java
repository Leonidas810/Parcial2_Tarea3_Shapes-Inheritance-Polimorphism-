package oop.parcial2.shapes;

public class Triangle extends Shape {
    private final int base;
    private final int height;

    public Triangle(int base,int height){
        super("oop.parcial2.shapes.Triangle ▲",3,base*3,(height*base)/2);
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
