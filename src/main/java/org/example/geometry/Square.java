package org.example.geometry;

public class Square extends Rectangle implements Area{
    public Square(double cX, double cY, double width, double rotationAngle){
        super(cX, cY, width, rotationAngle);
    }
    public Square(double cX, double cY, double width){
        super(cX, cY, width);
    }
}
