package org.example.exercises.ex1p24;

import org.example.geometry.Formula;
import org.example.geometry.Point;

public class testInit2 {
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

    static public Point[] initPointsArray(){
        return new Point[LEN];
    }
}
