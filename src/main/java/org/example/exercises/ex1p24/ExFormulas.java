
//
// Ex. 1 p.24 formulas
//

package org.example.exercises.ex1p24;

public class ExFormulas {
    public static double f1(double x){
        double y = 0.0;
        if(x < -1){
           y = Math.pow(x, 6) * Math.log10( Math.abs(Math.pow(6,x)-Math.pow(Math.abs(x-5),x) ));
        }

        else if(x >=-1 && x < 1){
            y = Math.sin(   (x)/(1-2*Math.pow(x,2))  );
        }

        else if(x >= 1){
            y = Math.asin(1 / Math.pow(x,4));
        }
        return y;
    }

    public static double f2(double x){
        double y = 0.0;
        if(x <= 1){
            y = Math.asin(   (x)/(Math.pow(x,2)+1)   );
        }

        if(x > 1 && x < 2){
            y = Math.log(   (Math.pow(x,4))/(1+Math.pow(x,4))   );
        }

        if(x >= 2){
            y = Math.log10(   Math.abs( Math.pow(2,-x) * Math.pow(x,4-x) )   );
        }
        return y;
    }

    public static double f3(double x){
        double y = 0.0;
        if(x <= -0.5){
            y = -Math.pow(x,5) + Math.log10(Math.abs(   Math.pow(3,x) - Math.pow(Math.abs(x),-x)    ));
        }

        if(x > -0.5 && x < 0.5){
            y = Math.tan(x/(1-Math.pow(x,2)));
        }

        if(x >= 0.5){
            y = Math.acos(1/(4*x));
        }
        return y;
    }

    public static double f4(double x){
        double y = 0.0;
        if(x <= 3){
            y = Math.log(   Math.abs( Math.pow(2,x)+Math.pow(x,7) + Math.pow(Math.abs(x-4),x) )   );
        }

        if(x > 3 && x < 5){
            y = Math.pow(   Math.log( Math.pow(x/(1+Math.pow(x,2)),4) ),9   );
        }

        if(x >= 5){
            y = Math.acos(1/x) + 1;
        }
        return y;
    }

    public static double f5(double x){
        double y = 0.0;
        if(x <= -3){
            y = Math.atan(Math.sqrt(Math.abs(x)))+3;
        }

        if(x > -3 && x < 3){
            y = Math.cos(   (Math.pow(x,5)+2*x)/(3+Math.pow(x,2))   );
        }

        if(x >= 3){
            y = Math.pow(x,4) + Math.pow(3,-x)*Math.pow(x,x-5);
        }
        return y;
    }

    public static double f6(double x){
        double y = 0.0;
        if(x <= 1){
            y = Math.log(   Math.abs(Math.pow(7,x) - Math.pow(Math.abs(x - 3),7))  ) / Math.log(7);
        }

        if(x > 1 && x < 3){
            y = Math.log(   Math.pow(x,8)/(1+Math.pow(x,2))   );
        }

        if(x >= 3){
            y = x/(1+Math.pow(x,2));
        }
        return y;
    }

    public static double f7(double x){
        double y = 0.0;
        if(x <= 2){
            y = Math.log(   Math.pow(Math.abs(x - 4),x) + Math.pow(2,Math.pow(Math.abs(x),1.0/4))  ) / Math.log(5);
        }

        if(x > 2 && x < 8){
            y = Math.sqrt(x/(1+Math.pow(x,2)));
        }

        if(x >= 8){
            y = Math.pow(Math.asin(x/(Math.pow(x,3)+1)),5);
        }
        return y;
    }

    public static double f8(double x){
        double y = 0.0;
        if(x <= 8){
            y = Math.acos(Math.pow(Math.E, -Math.abs(x)));
        }

        if(x > 8 && x < 9){
            y = Math.cos(   Math.pow(x,5)/(7+Math.pow(x,2))   );
        }

        if(x >= 9){
            y = Math.pow(x,8) + Math.pow(x,x-10);
        }
        return y;
    }

    public static double f9(double x){
        double y = 0.0;
        if(x <= -2){
            y = Math.acos(Math.pow(Math.E, x));
        }

        if(x > -2 && x < 2){
            y = Math.tan(   (5*x)/(4-Math.pow(x,9))   );
        }

        if(x >= 2){
            y = Math.pow(Math.pow(Math.abs(x-2),x) + 1,3 );
        }
        return y;
    }

    public static double f10(double x){
        double y = 0.0;
        if(x <= -4){
            y = Math.cos(x-1);
        }

        if(x > -4 && x < 4){
            y = Math.acos(   Math.pow(x,6)/(1+Math.pow(x,6))   );
        }

        if(x >= 4){
            y = Math.pow(   Math.log(Math.pow(x,5)-Math.pow(x,3)+Math.pow(10,x) ) / Math.log(2),1.0/4   );
        }
        return y;
    }
}
