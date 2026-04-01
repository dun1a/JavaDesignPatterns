package Assignment;

public interface ComputerBuilder {

    // should declare methods for setting each component of the Computer

    void buildProcessor();
    void buildRAM();
    void buildHardDrive();
    void buildGraphicsCard();
    void buildOperatingSystem();
     Computer getComputer(); // method to return the final Computer product
}
