package org.example.geometry;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Figure implements Area {
    private final Object packedObject;
    private static final Logger log = Logger.getLogger(Figure.class.getName());

    public Figure(Object obj){
        this.packedObject = obj;
    }

    public boolean checkPointIncluded(Point point){
        try {
            if(packedObject.getClass() == Rectangle.class){
                Rectangle unpackedObject = (Rectangle) packedObject;
                return unpackedObject.checkPointIncluded(point);
            }

            else if(packedObject.getClass() == Square.class){
                Square unpackedObject = (Square) packedObject;
                return unpackedObject.checkPointIncluded(point);
            }

            else if(packedObject.getClass() == Semicircle.class){
                Semicircle unpackedObject = (Semicircle) packedObject;
                return unpackedObject.checkPointIncluded(point);
            }

            else if(packedObject.getClass() == Triangle.class){
                Triangle unpackedObject = (Triangle) packedObject;
                return unpackedObject.checkPointIncluded(point);
            }


        } catch(Exception e) {
            log(e);
        }
        return false;
    }

    public void print(){
        if(packedObject.getClass() == Square.class){
            Square unpackedObj = (Square) packedObject;
            unpackedObj.print();
        }

        if(packedObject.getClass() == Rectangle.class){
            Rectangle unpackedObj = (Rectangle) packedObject;
            unpackedObj.print();
            return;
        }

        if(packedObject.getClass() == Semicircle.class){
            Semicircle unpackedObj = (Semicircle) packedObject;
            unpackedObj.print();
            return;
        }

        if(packedObject.getClass() == Triangle.class){
            Triangle unpackedObj = (Triangle) packedObject;
            unpackedObj.print();
            return;
        }
    }

    private void log(Exception e){
        log.log(Level.SEVERE, "Passed object unable to compute including. Exception: ", e);
    }
}
