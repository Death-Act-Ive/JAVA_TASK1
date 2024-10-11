package org.example.geometry;

public class Rectangle implements Area{
    // rectangle center
    private Point cV;
    // rectangle vertices
    private Point v1, v2, v3, v4; //
    private double width;
    private double height;
    private double angle = 0;

    public Rectangle(double cX, double cY, double width, double height, double rotationAngle){
        this.cV = new Point(cX, cY);
        this.width = width;
        this.height = height;
        this.angle = rotationAngle;

        this.v1 = new Point();
        this.v2 = new Point();
        this.v3 = new Point();
        this.v4 = new Point();
        this.calculateVertices();
    }
    public Rectangle(double cX, double cY, double width, double height){
        this.cV = new Point(cX, cY);
        this.width = width;
        this.height = height;

        this.v1 = new Point();
        this.v2 = new Point();
        this.v3 = new Point();
        this.v4 = new Point();
        this.calculateVertices();
    }

    public Rectangle(double cX, double cY, double width){
        this.cV = new Point(cX, cY);
        this.width = width;
        this.height = width;

        this.v1 = new Point();
        this.v2 = new Point();
        this.v3 = new Point();
        this.v4 = new Point();
        this.calculateVertices();
    }

    public boolean checkPointIncluded(Point point){
        // triangle method: checking point form only acute or rectangular triangles with square vertices

        // distances from vertices to point
        double d1,d2,d3,d4;

        // angles
        double a1,a2,a3,a4,a5,a6,a7,a8; // for out angles

        d1 = Math.sqrt( Math.pow(point.getX() - v1.getX(),2) + Math.pow(point.getY() - v1.getY(), 2) );
        d2 = Math.sqrt( Math.pow(point.getX() - v2.getX(),2) + Math.pow(point.getY() - v2.getY(), 2) );
        d3 = Math.sqrt( Math.pow(point.getX() - v3.getX(),2) + Math.pow(point.getY() - v3.getY(), 2) );
        d4 = Math.sqrt( Math.pow(point.getX() - v4.getX(),2) + Math.pow(point.getY() - v4.getY(), 2) );

        double a = d4;
        double b = d1;
        double c = this.width;
        a1 = Math.acos( (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2.0*b*c) )  * 180 / Math.PI;

        a = d2;
        b = d1;
        a2 = Math.acos( (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2.0*b*c) )  * 180 / Math.PI;

        a = d3;
        b = d2;
        a3 = Math.acos( (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2.0*b*c) )  * 180 / Math.PI;

        a = d1;
        b = d2;
        a4 = Math.acos( (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2.0*b*c) )  * 180 / Math.PI;

        a = d2;
        b = d3;
        a5 = Math.acos( (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2.0*b*c) )  * 180 / Math.PI;

        a = d4;
        b = d3;
        a6 = Math.acos( (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2.0*b*c) )  * 180 / Math.PI;

        a = d1;
        b = d4;
        a7 = Math.acos( (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2.0*b*c) )  * 180 / Math.PI;

        a = d3;
        b = d4;
        a8 = Math.acos( (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2.0*b*c) )  * 180 / Math.PI;

        if(a1 >= 90.0 || a3 >= 90.0 || a2 >= 90.0 || a4 >= 90.0 ||
                a5 >= 90.0 || a6 >= 90.0 || a7 >= 90.0 || a8 >= 90.0)
            return false;

        return true;
    }

    private void calculateVertices(){
        // calculation vertices before rotation
        double cX = this.cV.getX();
        double cY = this.cV.getY();

        this.v1.setX(cX-this.width /2);
        this.v1.setY(cY+this.height /2);

        this.v2.setX(cX+this.width /2);
        this.v2.setY(cY+this.height /2);

        this.v3.setX(cX+this.width /2);
        this.v3.setY(cY-this.height /2);

        this.v4.setX(cX-this.width /2);
        this.v4.setY(cY-this.height /2);

        // rotation
        // x' = x*cos(angle) - y*sin(angle) + centerCoordX
        // y' = x*sin(angle) + y*cos(angle) + centerCoordY
        if(this.angle != 0){
            rotate(this.angle);
        }
    }

    public void rotate(double angle){
        this.angle = angle;
        double cX = this.cV.getX();
        double cY = this.cV.getY();

        double x1 = cX-this.width /2;
        double y1 = cY+this.height /2;

        double x2 = cX+this.width /2;
        double y2 = cY+this.height /2;

        double x3 = cX+this.width /2;
        double y3 = cY-this.height /2;

        double x4 = cX-this.width /2;
        double y4 = cY-this.height /2;

        double radAngle = this.angle * Math.PI / 180;

        this.v1.setXY(x1*Math.cos(radAngle) - y1*Math.sin(radAngle) + cX, x1*Math.sin(radAngle) + y1*Math.cos(radAngle) + cY);
        this.v2.setXY(x2*Math.cos(radAngle) - y2*Math.sin(radAngle) + cX, x2*Math.sin(radAngle) + y2*Math.cos(radAngle) + cY);
        this.v3.setXY(x3*Math.cos(radAngle) - y3*Math.sin(radAngle) + cX, x3*Math.sin(radAngle) + y3*Math.cos(radAngle) + cY);
        this.v4.setXY(x4*Math.cos(radAngle) - y4*Math.sin(radAngle) + cX, x4*Math.sin(radAngle) + y4*Math.cos(radAngle) + cY);
    }

    public void print(){
        System.out.println(
                "Rectangle:[\n" +
                        "     V1("+this.v1.getX()+";"+this.v1.getY()+"),\n" +
                        "     V2("+this.v2.getX()+";"+this.v2.getY()+"),\n" +
                        "     V3("+this.v3.getX()+";"+this.v3.getY()+"),\n" +
                        "     V4("+this.v4.getX()+";"+this.v4.getY()+"),\n" +
                        "     Center("+this.cV.getX()+";"+this.cV.getY()+"),\n" +
                        "     Width="+this.width+"\n" +
                        "     Height="+this.height+"\n" +
                        "     Rotation="+this.angle+"\n" +
                        "]"
        );
    }
}
