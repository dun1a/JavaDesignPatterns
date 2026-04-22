package Example;

import java.util.ArrayList;
import java.util.List;

// is concrete implementation of the ATC interface
// ACTS AS A MEDIATOR
// maintains a list of runways and handles assignments of runways
// responds to aircraft takeoff and landing requests
public class Tower implements ATC {

    private List<Runway> runways;

    public Tower() {
        this.runways = new ArrayList<>();
    }

    @Override
    public void registerRunway(Runway runway) {
        runways.add(runway);

    }

    @Override
    public void requestRunway(Aircraft aircraft) {
        System.out.println("Runway requested by " + aircraft);
        Runway runway = selectRunway(aircraft);
        boolean granted = runway.addAircraft(aircraft);
        if(granted) {
            if (aircraft.getIntention() == Intention.LANDING) {
                aircraft.clearForLanding(runway);
            } else if (aircraft.getIntention() == Intention.TAKEOFF) {
                aircraft.clearForTakeoff(runway);
            }
        }
        else {
            aircraft.holdPosition(runway);
        }
    }


    public Runway selectRunway(Aircraft aircraft) {
        // check if there is a runway with no aircraft
        for (Runway runway : runways) {
            if (runway.isVacant()) {
                return runway;
            }
        }

        // choose runway with the shortest queue
        Runway selected = runways.get(0);
        for (Runway runway : runways) {
            if (runway.getQueueSize() < selected.getQueueSize()) {
                selected = runway;
    }
        }
        return selected;
    }

    @Override
    public void acknowledge(String message) {
        System.out.println("Tower acknowledges: " + message);

    }

    @Override
    public void tick() {
        for (Runway runway : runways) {
            boolean isEmpty = runway.decreaseOccupiedTime();
            if (isEmpty) {
                Aircraft aircraft = runway.getWaitingAircraft();
                if (aircraft != null) {
                    runway.addAircraft(aircraft);
                    if(aircraft.getIntention() == Intention.LANDING) {
                        aircraft.clearForLanding(runway);
                    }
                    else {
                        aircraft.clearForTakeoff(runway);
                    }
                }
            }
        }
    }
}
