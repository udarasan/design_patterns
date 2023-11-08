package org.example.structural.decorator_design_pattern;

/**
 * @TimeStamp 2023-11-08 17:50
 * @ProjectDetails design_patterns
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        //calling most supper class constructor
        super(decoratorShape);
    }
    @Override
    public void draw(){
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Colour : Red");
    }
}
