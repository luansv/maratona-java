package jiraya.javacore.designpatterns.exercises.exercise01;

public interface Shape {
    String getShape();
}

class Circle implements Shape{
    @Override
    public String getShape() {
        return "Drawing a circle";
    }
}

class Square implements Shape{

    @Override
    public String getShape() {
        return "Drawing a square";
    }
}

class Rectangle implements Shape{

    @Override
    public String getShape() {
        return "Drawing a rectangle";
    }
}
