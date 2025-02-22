package jiraya.javacore.designpatterns.exercises.exercise01;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.newShape(shapeType.CIRCLE);
        System.out.println(shape.getShape());
    }
}
