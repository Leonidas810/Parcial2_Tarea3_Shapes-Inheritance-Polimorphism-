package oop.parcial2.shapes;

public class Shape {

    private final String name;
    private final int sides;
    private final float perimeter;
    private final float area;

    public Shape(String name,int sides,float perimeter,float area){
        this.name=name;
        this.sides=sides;
        this.perimeter=perimeter;
        this.area=area;
    }

    public String getName() {
        return name;
    }

    public int getSidesCount() {
        return sides;
    }

    public float getPerimeter() {return perimeter;}

    public float getArea() {
        return area;
    }
}
