package Assignment.commands;

import Assignment.receiver.Pixel;

public class MoveUpCommand implements Command {

    private final Pixel pixel;

    public MoveUpCommand(Pixel pixel) {
        this.pixel = pixel;
    }

    @Override
    public void execute() {
        pixel.moveUp();
    }
}
