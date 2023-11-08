package org.example.structural.decorator_design_pattern;

/**
 * @TimeStamp 2023-11-08 17:37
 * @ProjectDetails design_patterns
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;
    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape=decoratorShape;
    }
    public void draw(){
        decoratorShape.draw();
    }
}
