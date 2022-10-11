package oop.parcial2.shapes;

public class Circle extends Shape {
    private final float radio;

    public Circle(float radio){
        super("oop.parcial2.shapes.Circle ○",1, (float) (2*radio*3.1416), (float) (3.1416*(radio*radio)));
        this.radio=radio;
    }

    public float getRadio() {
        return radio;
    }
}
