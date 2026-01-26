package Assignment;


public class Employee extends Organization{

    private double salary;
    Department department;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

//    @Override
//    public void printData() {
//        System.out.println("Employee: " + this.name + ", Salary: " + this.salary);
//    }

        @Override
    public void printData() {
            System.out.println("                <employee>");

            System.out.println("                    <name>" + this.name + "</name>");
            System.out.println("                    <salary>" + this.salary + "</salary>");


            System.out.println("                </employee>");
    }

    @Override
    public void addDepartment(Organization organization) {
        System.out.println("Cannot add or remove department from an employee.");
    }

    @Override
    public void removeDepartment(Organization organization) {
        System.out.println("Cannot add or remove department from an employee.");
    }

    @Override
    public Organization getChild(int index) {
        return null;
    }

    @Override
    public double getTotalSalary() {
        return getSalary();
    }

}
