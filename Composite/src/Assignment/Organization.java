package Assignment;

public abstract class Organization {
    protected String name;

    public Organization(String name) {
        this.name = name;
    }

    public abstract void printData();


    public abstract void addDepartment(Organization organization);

    public abstract void removeDepartment(Organization organization);

    public abstract Organization getChild(int index);

    public abstract double getTotalSalary();

}
