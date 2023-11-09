package org.example.structural.decorator_design_pattern;

/**
 * @TimeStamp 2023-11-08 17:53
 * @ProjectDetails design_patterns
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle=new Circle();
        //we are decorating circle object using red shape decorator class
        Shape redCircle=new RedShapeDecorator(new Circle());
        //we are decorating rectangle object using red shape decorator class
        Shape redRectangle=new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle with red border");
        redCircle.draw();
        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }
}
