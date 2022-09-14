
import java.util.*;

/**
 * 
 */
public class Camera {

    /**
     * Default constructor
     */
    public Camera() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public String status;

    /**
     * 
     */
    private double zoom;

    /**
     * 
     */
    private double pan_angle;

    /**
     * 
     */
    private double field_view;


    /**
     * 
     */
    public Set<Frame> capturedFrames {List};

    /**
     * @param z
     */
    public void changeZoom(double z) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Frame capture() {
        // TODO implement here
        return null;
    }

    /**
     * @param a
     */
    public void changeAngle(double a) {
        // TODO implement here
    }

}