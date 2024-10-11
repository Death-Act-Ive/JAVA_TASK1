//
// Ex. 1 p.16-17 formulas
//

package org.example.exercises.ex1p16;

public class Ex1Formulas {
    public static double f1(double x) {
        double y;
        y = Math.asin(
                Math.pow(
                        (Math.sqrt(Math.abs(x)))
                                    /
                        (Math.sqrt(Math.abs(x)) + 1)
                ,5)
        ) +
                Math.pow(Math.pow(x,2)+1, 1.0/5) +
                Math.log(   Math.pow(2,Math.sin(x)) + Math.pow(Math.abs(x), Math.cos(x))    ) / Math.log(2)
        ;
        return y;
    }
    public static double f2(double x) {
        double y;
        y = Math.pow(
                Math.pow(
                        Math.acos(
                                Math.cos(   Math.sqrt(Math.abs(x))  )
                                                    /
                                (Math.pow(  Math.cos(Math.sqrt(Math.abs(x))),2  ) + 5)
                        )
                ,6)
        ,1.0/5) +
                (Math.log(  Math.pow(4, 1.0/Math.tan(4*x)) + 5  ) / Math.log(2))
        ;
        return y;
    }

    public static double f3(double x) {
        double y;
        y = Math.sqrt(
                Math.abs(
                        Math.asin(
                                (Math.cos(  Math.cbrt(Math.abs(x))  ))
                                                    /
                                (Math.pow(  Math.cos(Math.cbrt(Math.abs(x))),2  ) + 7)
                        ) +
                        Math.pow(Math.log10(Math.pow(2,x) + Math.pow(Math.abs(x), 2 * Math.tan(x))), 5)
                )
            )
        ;
        return y;
    }

    public static double f4(double x) {
        double y;
        y = Math.pow(   Math.acos(  Math.pow(x,3)/(Math.pow(x,3)+1) ),3    ) +
                Math.pow(   (Math.sqrt(Math.abs(x)) + 1),1.0/7    ) +
                Math.pow(   (   Math.log(Math.pow(5,Math.tan(x)) + Math.pow(Math.abs(x), Math.sin(x))) / Math.log(5)    ),2  )
        ;
        return y;
    }

    public static double f5(double x) {
        double y;
        y = Math.sqrt(
                Math.pow(
                        Math.acos(
                                (Math.cos(Math.pow(Math.abs(x),1.0/6)))
                                                    /
                                (Math.pow(Math.cos(Math.pow(Math.abs(x),1.0/6)),2) + 5)
                        )
                ,3)
            ) +
            Math.log(Math.pow(3, Math.tan(2*x))+2) / Math.log(3)
        ;
        return y;
    }

    public static double f6(double x) {
        double y;
        y = Math.pow(Math.asin(  Math.pow(x,2) / (Math.pow(x,2)+1) ),7) +
                Math.pow(   Math.sqrt(2*Math.abs(x+3))+4,1.0/3 ) +
                Math.log(   Math.pow(3,1.0/Math.tan(x)) + Math.pow(Math.abs(x), Math.cos(x))   ) / Math.log(7)
        ;
        return y;
    }

    public static double f7(double x) {
        double y;
        y = Math.sqrt(
                Math.abs(
                        Math.asin(
                                (Math.sin(Math.cbrt(Math.abs(x))))
                                                /
                                (Math.pow(Math.sin(Math.cbrt(Math.abs(x))),2) + 7)
                        ) +
                        Math.pow(   Math.log(   Math.pow(2,Math.sin(2*x+1))+2  )/Math.log(3) ,8)
                )
        )
        ;
        return y;
    }

    public static double f8(double x) {
        double y;
        y = Math.acos(  Math.pow((Math.pow(x,1.0/5)) / (Math.pow(x,1.0/5)+1),9)  ) +
                Math.pow(   Math.log(Math.pow(4,Math.tan(3*x)) + Math.sqrt(Math.abs(3*x-1)) + Math.pow(Math.abs(x),Math.sin(2*x))) / Math.log(5),2  )
        ;
        return y;
    }

    public static double f9(double x) {
        double y;
        y = Math.sqrt(Math.pow((Math.abs(Math.acos(  (Math.cos(Math.pow(Math.abs(x),1.0/9))) / (Math.pow(Math.cos(Math.pow(Math.abs(x),1.0/9)),2)+7) ))),9)) +
                Math.log10(     Math.pow(2,Math.sin(3*x-1)) + Math.pow(3,Math.tan(x))    )
        ;
        return y;
    }

    public static double f10(double x) {
        double y;
        y = Math.cbrt(
                Math.abs(
                    Math.asin(  Math.pow(x,8) / (Math.pow(x,8)+3)  ) +
                    (Math.log(   Math.pow(2,Math.cos(Math.sqrt(Math.abs(x+1)))) + Math.pow(Math.abs(x+1),5*Math.sin(3*x+1))  ) / Math.log(4))
                )
        )
        ;
        return y;
    }


}
