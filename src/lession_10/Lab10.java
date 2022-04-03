package lession_10;

import java.util.ArrayList;
import java.util.List;

public class Lab10 {
    /**
     * Get lab 8.1 done with abstraction!
     */

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new FTE());
        employeeList.add(new FTE());
        employeeList.add(new FTE());
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
