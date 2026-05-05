package Assignment.commands;

import Assignment.receiver.Pixel;

public class DrawCommand implements Command {

    private Pixel pixel;

    public DrawCommand(Pixel pixel) {
        this.pixel = pixel;
    }

    @Override
    public void execute() {
        pixel.draw();
    }
}
