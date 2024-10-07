package org.example.exercise;

public class exerciseFormulas {
    public static double f1(double x) {
        double y;
        y = Math.asin(
                Math.pow(
                        (Math.sqrt(Math.abs(x)))
                                /
                        (Math.sqrt(Math.abs(x)) + 1)
                        , 5)
        ) +
                Math.pow(Math.pow(x,2)+1,1.0/5) +
                Math.log(Math.pow(2,Math.sin(x)) + Math.pow(Math.abs(x), Math.cos(x))) / Math.log(2);
        return y;
    }
    public static double f2(double x) {
        double y;
        y = Math.pow(
                Math.pow(
                        Math.acos(
                                Math.cos(Math.sqrt(Math.abs(x)))
                                        /
                                (Math.pow(Math.cos(Math.sqrt(Math.abs(x))),2)+5)
                        )
                        ,6)
                ,1.0/5) +
                (Math.log(  Math.pow(4, 1.0/Math.tan(4*x)) + 5  ) / Math.log(2));
        return y;
    }

    public static double f3(double x) {
        double y;
        y=x;
//        y = Math.pow(Math.asin( (Math.cos(Math.cbrt())) / () ),1.0/5);
        return y;
    }

    public static double f4(double x) {
        double y;
        y = x * 36;
        return y;
    }

    public static double f5(double x) {
        double y;
        y = x * 36;
        return y;
    }

    public static double f6(double x) {
        double y;
        y = x * 36;
        return y;
    }

    public static double f7(double x) {
        double y;
        y = x * 36;
        return y;
    }

    public static double f8(double x) {
        double y;
        y = x * 36;
        return y;
    }

    public static double f9(double x) {
        double y;
        y = x * 36;
        return y;
    }

    public static double f10(double x) {
        double y;
        y = x * 36;
        return y;
    }
}
