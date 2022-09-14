
import java.util.*;

/**
 * 
 */
public abstract class Appliances {

    /**
     * Default constructor
     */
    public Appliances() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public string status;

    /**
     * 
     */
    public Room location;


    /**
     * 
     */
    public Set<Usage> usageList;

    /**
     * 
     */
    public Set<ElectricitySensor> attachedSensors;


    /**
     * @param type
     */
    public void addSensor(String type) {
        // TODO implement here
    }

    /**
     * @param id
     */
    public void removeSensor(int id) {
        // TODO implement here
    }

    /**
     * 
     */
    public void updateStatus() {
        // TODO implement here
    }

    /**
     * @param u
     */
    public void updateUsage(Usage u) {
        // TODO implement here
    }

    /**
     * 
     */
    public void usageFlush() {
        // TODO implement here
    }

    /**
     * @return
     */
    public List<Usage> getUsageRecord() {
        // TODO implement here
        return null;
    }

}