package Facade;

public class ShapeMaker implements Shape {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    @Override
    public void draw() {
    }
    public ShapeMaker(){
        circle=new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
