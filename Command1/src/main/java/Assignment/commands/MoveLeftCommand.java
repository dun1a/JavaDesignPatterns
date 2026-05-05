package Assignment.commands;

import Assignment.receiver.Pixel;

public class MoveLeftCommand implements Command {

    private Pixel pixel;

    public MoveLeftCommand(Pixel pixel) {
        this.pixel = pixel;
    }

    @Override
    public void execute() {
        pixel.moveLeft();
    }
}
