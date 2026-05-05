package Assignment.commands;

import Assignment.receiver.Pixel;

public class MoveRightCommand implements Command {

    private final Pixel pixel;

    public MoveRightCommand(Pixel pixel) {
        this.pixel = pixel;
    }

    @Override
    public void execute() {
        pixel.moveRight();
    }
}
