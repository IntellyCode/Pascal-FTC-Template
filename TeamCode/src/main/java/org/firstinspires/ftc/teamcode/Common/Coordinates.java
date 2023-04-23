package org.firstinspires.ftc.teamcode.Common;
import java.util.List;
/*This class has all the necessary functions related to coordinates.
This does not store any data, but is used to make code easier to read and understand. 
This might be pointless if RoadRunner of FTC navigation is used. 
*/
public class Coordinates {
    double scaleFactor; //used for tiles of thje field.
    public double getScaleFactor() {
        return scaleFactor;
    }

    double x;
    public double getX() { return x*scaleFactor; }
    double y;
    public double getY() { return y*scaleFactor; }

    public Coordinates(double x, double y) {
        scaleFactor = 1;
        this.x = x;
        this.y = y;
    }

    public Coordinates(double x, double y, double scaleFactor) {
        this.scaleFactor = scaleFactor;
        this.x = x;
        this.y = y;
    }

    public boolean equals(Coordinates coordinates) {
        if(coordinates.getX() == this.getX() && coordinates.getY() == this.getY())
            return true;
        return false;
    }

    public static Coordinates add(Coordinates coordinates1, Coordinates coordinates2) {
        double newX = coordinates1.getX() + coordinates2.getX();
        double newY = coordinates1.getY() + coordinates2.getY();
        return new Coordinates(newX, newY);
    }

}
