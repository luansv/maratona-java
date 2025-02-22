package jiraya.javacore.designpatterns.exercises.exercise01;

public class ShapeFactory {
    public static Shape newShape (shapeType shapeType){
        switch (shapeType){
            case CIRCLE: return new Circle();
            case RECTANGLE: return new Rectangle();
            case SQUARE: return new Square();

            default: throw new IllegalArgumentException("Shape was not found!");
        }
    }
}
