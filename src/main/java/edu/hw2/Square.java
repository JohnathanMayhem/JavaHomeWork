package edu.hw2;

public class Square extends Task2.Polygon {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int length) {
        this.width = length;
        this.height = length;
    }

    @Override
    public void setHeight(int length) {
        this.width = length;
        this.height = length;
    }

    @Override
    public double area() {
        return width * height;
    }
}
