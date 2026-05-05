package Example.receivers;

import Example.client.StatusWindow;

public class CurtainSystem {

    private StatusWindow statusWindow;

    public CurtainSystem(StatusWindow statusWindow) {
        this.statusWindow = statusWindow;
    }

    public void raise(){
        System.out.println("Curtain is raised");
        statusWindow.updateLightStatus(true);
    }

    public  void lower(){
        System.out.println("Curtain is lowered");
        statusWindow.updateLightStatus(false);
    }
}
