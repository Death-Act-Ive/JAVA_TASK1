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
            if(packedObject instanceof Rectangle){
                Rectangle unpackedObject = (Rectangle) packedObject;
                return unpackedObject.checkPointIncluded(point);
            }

            else if(packedObject instanceof Square){
                Square unpackedObject = (Square) packedObject;
                return unpackedObject.checkPointIncluded(point);
            }

            else if(packedObject instanceof Semicircle){
                Semicircle unpackedObject = (Semicircle) packedObject;
                return unpackedObject.checkPointIncluded(point);
            }

            else if(packedObject instanceof Triangle){
                Triangle unpackedObject = (Triangle) packedObject;
                return unpackedObject.checkPointIncluded(point);
            }


        } catch(Exception e) {
            log(e);
        }
        return false;
    }

    public void print(){
        if(packedObject instanceof Square){
            Square unpackedObj = (Square) packedObject;
            unpackedObj.print();
        }

        if(packedObject instanceof Rectangle){
            Rectangle unpackedObj = (Rectangle) packedObject;
            unpackedObj.print();
        }

        if(packedObject instanceof Semicircle){
            Semicircle unpackedObj = (Semicircle) packedObject;
            unpackedObj.print();
        }

        if(packedObject instanceof Triangle){
            Triangle unpackedObj = (Triangle) packedObject;
            unpackedObj.print();
        }
    }

    private void log(Exception e){
        log.log(Level.SEVERE, "Passed object unable to compute including. Exception: ", e);
        return;
    }
}
