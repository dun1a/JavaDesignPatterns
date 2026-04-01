package Assignment;

public class GamingComputerBuilder implements ComputerBuilder{

    Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
        System.out.println("Building a gaming computer...");
    }

    @Override
    public void buildProcessor() {
        computer.addComponent("AMD Ryzen 5 7600X");
    }

    @Override
    public void buildRAM() {
        computer.addComponent("32 GB RAM");

    }

    @Override
    public void buildHardDrive() {
        computer.addComponent("1 TB SSD (NVMe");
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent("NVIDIA® GeForce® GTX 1660 Ti");
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent("Windows 11 Home");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
