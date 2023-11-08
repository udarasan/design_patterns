package org.example.structural.facade_design_pattern;

/**
 * @TimeStamp 2023-11-08 18:05
 * @ProjectDetails design_patterns
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }

}
