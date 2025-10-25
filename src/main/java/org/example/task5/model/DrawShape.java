package org.example.task5.model;

import java.awt.*;

public abstract class DrawShape {

    public static final int SHAPE_RECTANGLE = 0;

    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2;
    private Point startPoint;
    private Point endPoint;

    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public abstract Shape getShape(Point startPoint, Point endPoint);

    public static DrawShape newInstance(int shapeType) {
        return switch (shapeType) {
            case DrawShape.SHAPE_RECTANGLE -> new Rectangle();
            case DrawShape.SHAPE_ROUNDED_RECT -> new RoundedRectangle();
            case DrawShape.SHAPE_ELLIPSE -> new Ellipse();
            default -> throw new IllegalStateException("Unexpected value: " + shapeType);
        };
    }

    public Shape getShape() {
        return this.getShape(startPoint, endPoint);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}