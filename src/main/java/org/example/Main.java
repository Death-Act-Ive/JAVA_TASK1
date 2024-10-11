/*
    Author: Arthur Atapin
    Book: https://moodle1.tsutmb.ru/pluginfile.php/1918885/mod_resource/content/1/AndreevAA_Programming_in_Delphi_LW_P1_2010.pdf
        Solves: [ Ex. 1, p. 16-17 ]
                [   Ex. 1 p. 24   ]
 */

package org.example;

import org.example.geometry.*;
import org.example.exercises.ex1p16.testInit;

import java.util.Scanner;


public class Main {

    // TODO: Add conceptual description  of solving;
    //
    // TODO: Add simple doc(?)

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        // formulas to calculate point's Y by X
        Formula [] formulasArray = testInit.initFormulasArray();

        // points
        Point [] pArray = testInit.initPointsArray();

        // figures
        Figure [] figArray = testInit.initFiguresArray();

        System.out.println("{Ex1.p16-17}");

        // mathching
        for(int i = 0; i < pArray.length; i++){
            System.out.println("["+(i+1)+"]"+" Please, set X for current point:");
            figArray[i].print();

            double curX = in.nextDouble();
            pArray[i] = new Point(curX, formulasArray[i]);
            pArray[i].print();

            System.out.println(figArray[i].checkPointIncluded(pArray[i]));
        }
    }
}