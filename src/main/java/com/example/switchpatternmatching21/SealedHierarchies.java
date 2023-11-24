package com.example.switchpatternmatching21;

import com.example.switchpatternmatching21.SealedShape.Circle;
import com.example.switchpatternmatching21.SealedShape.Rectangle;
import com.example.switchpatternmatching21.SealedShape.Shape;
import com.example.switchpatternmatching21.SealedShape.Square;

public class SealedHierarchies {
    public static void main(String[] args) {
        System.out.println(areaCalculateSealedHierarchies(new Circle(10)));
    }

    static String areaCalculateSealedHierarchies(Shape shape) {
        return switch (shape) {
            case Circle c -> "A Circle with area of " + c.area();
            case Square s -> "A Square with area of " + s.area();
            case Rectangle r -> "A Square with area of " + r.area();
        };
    }
}
