package assignment2;

public class Square extends Shape {
    private int width;
    private int height;
//    private int side;

    public Square(int side) {
        super();
        this.width=side;
        this.height=side;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public Square(String name, String color, int side) {
        super(name, color);
        this.width=side;
        this.height=side;
    }

    @Override
    public int getArea() {
        return width*height;
    }

    @Override
    public int getPerimeter() {
        return width*4;
    }
}
