package edu.hw2;

public class Rectangle extends Task2.Polygon {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void setWidth(int length) {
        this.width = length;
    }

    @Override
    public void setHeight(int length) {
        this.height = length;
    }
}
