package org.example.exercises.ex1p16;

import org.example.geometry.*;

public class testInit1 {
    static final Integer LEN = 10; // count of matching objects (array length)

    static public Formula[] initFormulasArray(){
        Formula[] formulasArray = new Formula[LEN];
        formulasArray[0] = ExFormulas::f1;
        formulasArray[1] = ExFormulas::f2;
        formulasArray[2] = ExFormulas::f3;
        formulasArray[3] = ExFormulas::f4;
        formulasArray[4] = ExFormulas::f5;
        formulasArray[5] = ExFormulas::f6;
        formulasArray[6] = ExFormulas::f7;
        formulasArray[7] = ExFormulas::f8;
        formulasArray[8] = ExFormulas::f9;
        formulasArray[9] = ExFormulas::f10;
        return formulasArray;
    }

    static public Figure[] initFiguresArray(){
        Figure [] figArray = new Figure[LEN];
        figArray[0] = new Figure(new Semicircle(0,0,5,"12"));
        figArray[1] = new Figure(new Square(0,0,3));
        figArray[2] = new Figure(new Square(0,0,4,45));
        figArray[3] = new Figure(new Semicircle(0,0,5,"1"));
        figArray[4] = new Figure(new Rectangle(2,2.5,4,5));
        figArray[5] = new Figure(new Triangle(0,0,0,1,1,0));
        figArray[6] = new Figure(new Triangle(-1,0,0,1,1,0));
        figArray[7] = new Figure(new Semicircle(0,0,5,"34"));
        figArray[8] = new Figure(new Square(3,3,6));
        figArray[9] = new Figure(new Square(0,0,8,45));
        return figArray;
    }

    static public Point [] initPointsArray(){
        return new Point[LEN];
    }

}
