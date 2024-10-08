/*
    Author: Arthur Atapin
    Book: https://moodle1.tsutmb.ru/pluginfile.php/1918885/mod_resource/content/1/AndreevAA_Programming_in_Delphi_LW_P1_2010.pdf
        Solves: [ Ex. 1, p. 16-17 ]
                [   Ex. 1 p. 24   ]
 */

package org.example;

import org.example.geometry.Point;
import org.example.exercises.ex1p16.Ex1Formulas;

public class Main {
    // TODO: Finish inserting of expressions and formulas for exercises;
    //       Add conceptual description of Point class realization;
    //
    // TODO: Build new base class 'figure';
    //       Build new classes: 'circle', 'square', rectangle and 'triangle' with polymorphic method
    //                              by common func. interface and method reference to check the area;
    //       Add conceptual description of figure classes realization;
    //
    // TODO: Add array mapping init.-n for fast point and figure matching;
    //
    // TODO: Probably, rebuild project packages hierarchy
    //
    // TODO: Add conceptual description  of solving;
    //
    // TODO: Add simple doc(?)

    public static void main(String[] args) {
        Point p1 = new Point(2.5, Ex1Formulas::f1);
        Point p2 = new Point(1, Ex1Formulas::f2);
        Point p3 = new Point(1.5, Ex1Formulas::f3);
        Point p4 = new Point(4, Ex1Formulas::f4);
        Point p5 = new Point(8, Ex1Formulas::f5);
        Point p6 = new Point(9, Ex1Formulas::f6);
        Point p7 = new Point(-26.9, Ex1Formulas::f7);
        Point p8 = new Point(10, Ex1Formulas::f8);
        Point p9 = new Point(10, Ex1Formulas::f9);
        Point p10 = new Point(10, Ex1Formulas::f10);
    }

}