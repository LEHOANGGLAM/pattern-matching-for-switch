package com.example.switchpatternmatching21.SealedShape;

public sealed interface Shape permits Circle, Square, Rectangle{
    double area();
}

