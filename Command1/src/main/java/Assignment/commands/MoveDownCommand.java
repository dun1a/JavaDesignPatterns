package Assignment.commands;

import Assignment.receiver.Pixel;

public class MoveDownCommand implements Command {

    private final Pixel pixel;

    public MoveDownCommand(Pixel pixel) {
        this.pixel = pixel;
    }

    @Override
    public void execute() {
        pixel.moveDown();
    }
}
