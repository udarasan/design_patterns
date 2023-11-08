package org.example.creational.factory_design_pattern;

/**
 * @TimeStamp 2023-11-08 15:39
 * @ProjectDetails design_patterns
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        }else {
            if (shapeType.equalsIgnoreCase("CIRCLE")){
                return new Circle();
            }else if (shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            }
        }
        return null;
    }
}
