package Assignment;

public class ComputerDirector {

    // the director class calls the builder interface's methods to assemble the computer
    ComputerBuilder computerBuilder; // an instance to help assemble a computer

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildRAM();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
    }
}
