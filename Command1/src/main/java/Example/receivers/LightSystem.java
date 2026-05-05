package Example.receivers;

import Example.client.StatusWindow;

public class LightSystem {

    private StatusWindow statusWindow;

    public LightSystem(StatusWindow statusWindow) {
        this.statusWindow = statusWindow;
    }

    public void on(){
        System.out.println("Light is on");
        statusWindow.updateLightStatus(true);
    }

    public void off(){
        System.out.println("Light is off");
        statusWindow.updateLightStatus(false);
    }
}
