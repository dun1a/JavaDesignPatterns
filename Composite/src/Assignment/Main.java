package Assignment;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Organization> departments = new ArrayList<Organization>();

        Organization itOrg = new Department("IT");
        Organization itEmployee1 = new Employee("Alice", 70000);
        Organization itEmployee2 = new Employee("Bob", 75000);
        Organization bt = new Department("BT");

        //itOrg.addDepartment(itOrg);
        itOrg.addDepartment(itEmployee1);
        itOrg.addDepartment(itEmployee2);
        bt.addDepartment(new Employee("Charlie", 80000));
        itOrg.addDepartment(bt);

        //itOrg.printData();
        //System.out.println("total salary of department: " + itOrg.getTotalSalary());
        //System.out.println("--- Accessing a child department ---");
        //System.out.println(itOrg.getChild(2).name);


        departments.add((itOrg));
        departments.add((bt));


//        System.out.println("--- After removing an employee ---");
//        itOrg.removeDepartment(itEmployee1);
//        System.out.println("--------------------");
//        itEmployee1.addDepartment(itOrg);
//        System.out.println("--------------------");
//        itOrg.printData();
//        bt.addDepartment(itEmployee1);
//        bt.printData();
//        System.out.println("-----------------------------");
//

        for(int i = 0; i < departments.size(); i++){
            System.out.println("<organization>");
            departments.get(i).printData();
            System.out.println("</organization>");
        }
    }
}
