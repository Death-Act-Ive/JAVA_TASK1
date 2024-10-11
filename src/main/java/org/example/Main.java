/*
    Author: Arthur Atapin
    Book: https://moodle1.tsutmb.ru/pluginfile.php/1918885/mod_resource/content/1/AndreevAA_Programming_in_Delphi_LW_P1_2010.pdf
        System Solves: [ Ex. 1, p. 16-17 ]
                       [   Ex. 1 p. 24   ]
 */

package org.example;

import org.example.geometry.*;
import org.example.exercises.ex1p16.testInit1;
import org.example.exercises.ex1p24.testInit2;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

    // EX1 P16-17
        // formulas to calculate point's Y by X
        Formula [] formulasArray = testInit1.initFormulasArray();

        // points
        Point [] pArray = testInit1.initPointsArray();

        // figures
        Figure [] figArray = testInit1.initFiguresArray();

        // mathching
        System.out.println("\n{Ex1.p16-17}");
        for(int i = 0; i < pArray.length; i++){
            figArray[i].print();
            System.out.println("["+(i+1)+"]"+" Please, set X for current point:");

            double curX = in.nextDouble();
            pArray[i] = new Point(curX, formulasArray[i]);
            pArray[i].print();

            System.out.println(figArray[i].checkPointIncluded(pArray[i]));
        }

    // EX.1 PAGE 24
        // formulas to calculate point's Y by X
        formulasArray = testInit2.initFormulasArray();

        // points
        pArray = testInit2.initPointsArray();

        // calculation
        System.out.println("\n{Ex1.p24}");
        for(int i = 0; i < pArray.length; i++){
            System.out.println("["+(i+1)+"]"+" Please, set X for current point:");
            double curX = in.nextDouble();

            pArray[i] = new Point(curX, formulasArray[i]);
            pArray[i].print();
        }
    }
}