package Example;

// combines the subsystems and provides a simple interface to handle common tasks such as arriving home or leaving home
// effectively reduces the complexity of the operations required from the client side

public class SmartHomeFacade {

    private Lights lights;
    private Heating heating;
    private SecuritySystem securitySystem;

    public SmartHomeFacade(Lights lights, Heating heating, SecuritySystem securitySystem) {
        this.lights = lights;
        this.heating = heating;
        this.securitySystem = securitySystem;
    }

    public void arriveHome(){
        System.out.println("Arriving home...");
        securitySystem.deactivate();
        heating.heatOn();
        lights.turnOn();
    }

    public void leaveHome(){
        System.out.println("Leaving home...");
        lights.turnOff();
        heating.heatOff();
        securitySystem.activate();
    }
}
