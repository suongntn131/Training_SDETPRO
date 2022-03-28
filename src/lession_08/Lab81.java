package lession_08;

import java.util.ArrayList;
import java.util.List;

public class Lab81 {
    /**
     * Create a class Employee with a method salary to return employee’s salar
     * There are 2 types of employee: Full time employee and contract employee
     * Full time employee has salary is 50000 and contract employee has salary 40000
     * Write a method to accept a list of Employee and calculate total salary
     * For example, company has 3 FTE and 2 contractor
     */

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new ContractEmployee());
        employeeList.add(new ContractEmployee());

        System.out.println("Total salary: " + calculateSalary(employeeList));
    }

    public static int calculateSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();

        }
        return totalSalary;
    }
}
