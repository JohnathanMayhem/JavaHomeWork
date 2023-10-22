package edu.hw2;

public class Task2 {

    private Task2() {

    }

    public static abstract class Polygon {

        protected int width;
        protected int height;

        public Polygon(int width, int height) {
            this.height = height;
            this.width = width;
        }

        public abstract void setWidth(int length);

        public abstract void setHeight(int height);

        public abstract double area();
    }
}


