package Example.command;

import Example.receivers.LightSystem;

public class LightsOnCommand implements Command {

    private LightSystem light;

    public LightsOnCommand(LightSystem light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
