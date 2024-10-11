package org.example.geometry;

public class Semicircle implements Area{
    private double radius;
    private Point cV;
    private String quarters;

    public Semicircle(double cX, double cY, double radius, String quarters) {
        this.cV = new Point(cX, cY);
        this.radius = radius;
        if(validateQuartersString(quarters)){
            this.quarters = quarters;
        }
        else{
            this.quarters = "1234";
        }
    }

    public Semicircle(double cX, double cY, double radius) {
        this.cV = new Point(cX, cY);
        this.radius = radius;
        this.quarters = "1234";
    }

    public boolean checkPointIncluded(Point point) {
        double pX = point.getX();
        double pY = point.getY();

        if(Math.pow(pX,2) + Math.pow(pY,2) <= Math.pow(this.radius,2)){
            if(this.quarters.contains("1")){
                if( (pX >= 0) && (pY >= 0) ){
                    return true;
                }
            }

            if(this.quarters.contains("2")){
                if( (pX <= 0) && (pY >= 0) ){
                    return true;
                }
            }

            if(this.quarters.contains("3")){
                if( (pX <= 0) && (pY <= 0) ){
                    return true;
                }
            }

            if(this.quarters.contains("4")){
                if( (pX >= 0) && (pY <= 0) ){
                    return true;
                }
            }
        }

        return false;
    }

    public void print () {
        System.out.println(
                "Semicircle:[\n" +
                        "     Center(" + this.cV.getX() + ";" + this.cV.getY() + "),\n" +
                        "     Radius=" + this.radius + "\n" +
                        "     Quarters=" + this.quarters + "\n" +
                        "]"
        );
    }

    public void setQuarters(String quarters) {
        this.quarters = quarters;
    }

    boolean validateQuartersString(String quarters){
        return quarters.matches("[1-4]+");
    }
}
