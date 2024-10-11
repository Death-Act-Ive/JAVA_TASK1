package org.example.geometry;

public class Triangle implements Area{
    private Point v1,v2,v3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.v1 = new Point(x1,y1);
        this.v2 = new Point(x2,y2);
        this.v3 = new Point(x3,y3);
    }

    public Triangle(Point v1, Point v2, Point v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public boolean checkPointIncluded(Point point) {
        double x0,y0,x1,y1,x2,y2,x3,y3;
        x0 = point.getX();
        y0 = point.getY();
        x1 = v1.getX();
        y1 = v1.getY();
        x2 = v2.getX();
        y2 = v2.getY();
        x3 = v3.getX();
        y3 = v3.getY();

        double a = ((x1 - x0) * (y2 - y1)) - ((x2 - x1) * (y1 - y0));
        double b = ((x2 - x0) * (y3 - y2)) - ((x3 - x2) * (y2 - y0));
        double c = ((x3 - x0) * (y1 - y3)) - ((x1 - x3) * (y3 - y0));

        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0))
        {
            return true;
        }

        return false;
    }

    public void print(){
        System.out.println(
                "Triangle:[\n" +
                        "     V1("+this.v1.getX()+";"+this.v1.getY()+"),\n" +
                        "     V2("+this.v2.getX()+";"+this.v2.getY()+"),\n" +
                        "     V3("+this.v3.getX()+";"+this.v3.getY()+"),\n" +
                        "]"
        );
    }
}
