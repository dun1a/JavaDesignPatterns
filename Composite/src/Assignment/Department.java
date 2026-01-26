package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Department extends Organization {

    protected List<Organization> departments = new ArrayList<>();
    protected List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public Department(String name, Employee employee) {
        super(name);
        this.employees.add(employee);
    }
//
//    @Override
//    public void printData() {
//        System.out.println("Department: " + this.name);
//        for (Organization org : departments) {
//            for(Employee emp : employees){
//                System.out.println(" Employee: " + emp.name + ", Salary: " + emp.getSalary());
//            }
//            org.printData();
//        }
//    }

@Override
public void printData() {
    System.out.println("            <department>");

    System.out.println("                <name>" + this.name + "</name>");
    for(Organization org : departments) {

        for (Employee emp : employees) {
            emp.printData();
        }
        org.printData();

    }
    System.out.println("            </department>");

}

    @Override
    public void addDepartment(Organization organization) {
       departments.add(organization);
    }

    @Override
    public void removeDepartment(Organization organization) {
        departments.remove(organization);
    }

    @Override
    public Organization getChild(int index) {
        return departments.get(index);
    }

    @Override
    public double getTotalSalary(){
        double total = 0.0;
        for(Employee emp : employees){
            total += emp.getSalary();
        }
        for(Organization org : departments){
            total += org.getTotalSalary();
        }
        return total;
    }
}
