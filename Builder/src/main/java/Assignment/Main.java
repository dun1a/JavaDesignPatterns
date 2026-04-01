package Assignment;

public class Main {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new OfficeComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(computerBuilder);
        computerDirector.constructComputer();
        Computer computer = computerBuilder.getComputer();
        System.out.println(computer);
    }
}
