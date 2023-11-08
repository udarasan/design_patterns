package org.example.structural.facade_design_pattern;

/**
 * @TimeStamp 2023-11-08 18:02
 * @ProjectDetails design_patterns
 */
public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker(){
        circle=new Circle();
        square=new Square();
        rectangle=new Rectangle();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
