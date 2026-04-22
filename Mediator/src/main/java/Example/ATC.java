package Example;

// interface
// defines the methods the control tower must implement to interact with the aircraft and manage the runways
public interface ATC {

    void registerRunway(Runway runway);
    void requestRunway(Aircraft aircraft);
    void acknowledge(String message);
    void tick();

    }
