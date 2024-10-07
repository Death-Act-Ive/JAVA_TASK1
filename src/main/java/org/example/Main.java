/*
    Author: Arthur Atapin
    Ex. 1, p16-17
 */

package org.example;

import org.example.geometry.Point;

public class Main {
    // TODO: build new class 'figure'
    // TODO: build new classes: 'circle', 'square' and 'triangle' with specific params and method reference to check the area

    public static void main(String[] args) {
        Point p = new Point(2, Main::calculateY1);
    }

    // test function -- it worked!
    static float calculateY1(float x) {
        float y;
        y = x * 36;
        return y;
    }

}