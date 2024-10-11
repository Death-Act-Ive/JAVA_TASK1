package org.example.geometry;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Point {
    private double x;
    private double y;
    private Formula calcFunc;

    private static final Logger log = Logger.getLogger(Point.class.getName());

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(double x, Formula calcFunc) {
        this.x = x;
        this.calcFunc = calcFunc;
        try{
            this.y = this.calculateYByX(this.x);
            this.print();   // TODO: DELETE
        } catch (Exception e) {
            log(e);
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setXYbyX(double x) {
        this.x = x;
        this.y = calculateYByX(this.x);
    }

    public void print(){
        System.out.println("[x="+this.x+"; y="+this.y+"]");
    }

    public double calculateYByX(double x){
        return this.calcFunc.calculateYByX(x);
    }

    private void log(Exception e){
        log.log(Level.SEVERE, "Passed object unable to compute 'y' value. Exception: ", e);
    }
}
