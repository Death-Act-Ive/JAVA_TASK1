package org.example.geometry;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Point {
    private double x;
    private double y;
    private CalculateY calcFunc;

    private static final Logger log = Logger.getLogger(Point.class.getName());

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(double x, CalculateY calcFunc) {
        this.x = x;
        this.calcFunc = calcFunc;
        try{
            this.y = this.calculateY(this.x);
            System.out.println("x="+this.x+"; y="+this.y);
        } catch (Exception e) {
            log.log(Level.SEVERE, "Passed object unable to compute y value. Exception: ", e);
        }
    }

    double calculateY(double x){
        return this.calcFunc.calculateYByFormula(x);
    }

}
