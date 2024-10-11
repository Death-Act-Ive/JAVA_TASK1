package org.example.geometry;

/*
    Current interface makes callable static method references to compute 'y'-coordinate inside 'Point' class method
        possible.
    Also, 'Formula' interface acts like prototype & prohibits every function out of declared form of
        'calculateYByFormula' by types and arg.-s count.
    So static method reference realization due Java interface features for 'Point' class polymorphic method seems safe.
*/

public interface Formula {
    double calculateYByX(double x);
}
