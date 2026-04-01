package Assignment;

public class OfficeComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
            System.out.println("Building an office computer...");
    }

    @Override
    public void buildProcessor() {
        computer.addComponent("Intel Core i5-13400");
    }

    @Override
    public void buildRAM() {
        computer.addComponent("16 GB RAM");
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent("512 GB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent("Integrated (Intel UHD Graphics 730");
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent("Windows 11 Pro");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
