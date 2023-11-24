package com.example.switchpatternmatching21;

import com.example.switchpatternmatching21.SealedShape.Circle;
import com.example.switchpatternmatching21.SealedShape.Rectangle;
import com.example.switchpatternmatching21.SealedShape.Shape;
import com.example.switchpatternmatching21.SealedShape.Square;

public class RecordPatternAndSwitch {

    public static void main(String[] args) {
        record Pair(Object x, Object y) { }

        Pair p = new Pair(42, 42);

        switch (p) {
            case Pair(String s, String t) -> System.out.println(s + ", " + t);
            default -> System.out.println("Not a pair of strings");
        }

    }


}
