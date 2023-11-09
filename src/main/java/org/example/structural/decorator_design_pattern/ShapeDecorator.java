package org.example.structural.decorator_design_pattern;

/**
 * @TimeStamp 2023-11-08 17:37
 * @ProjectDetails design_patterns
 */
public abstract class ShapeDecorator implements Shape {
    //shape object instance
    //can be inherit to sub class - protected
    protected Shape decoratorShape;

    //constructor
    public ShapeDecorator(Shape decoratorShape){
        //initiate shape object
        this.decoratorShape=decoratorShape;
    }
    //override method
    public void draw(){
        decoratorShape.draw();
    }
}
