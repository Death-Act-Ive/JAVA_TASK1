/*
    Author: Arthur Atapin
    Ex. 1, p16-17
 */

package org.example;

import org.example.geometry.Point;
import org.example.exercise.exerciseFormulas;

public class Main {
    // TODO: build new class 'figure'
    // TODO: build new classes: 'circle', 'square' and 'triangle' with specific params and method reference to check the area

    public static void main(String[] args) {
        Point p1 = new Point(2.5, exerciseFormulas::f1);
        Point p2 = new Point(1, exerciseFormulas::f2);
        Point p3 = new Point(10, exerciseFormulas::f3);
        Point p4 = new Point(10, exerciseFormulas::f4);
        Point p5 = new Point(10, exerciseFormulas::f5);
        Point p6 = new Point(10, exerciseFormulas::f6);
        Point p7 = new Point(10, exerciseFormulas::f7);
        Point p8 = new Point(10, exerciseFormulas::f8);
        Point p9 = new Point(10, exerciseFormulas::f9);
        Point p10 = new Point(10, exerciseFormulas::f10);
    }

}