package JavaAdvanced.DefiningClasses_13.Exercise.CompanyRoster_2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Department> departments = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] params = sc.nextLine().split("\\s+");
            Employee employee = new Employee(
                    params[0], Double.parseDouble(params[1]));

            if (params.length == 5) {
                try {
                    int age = Integer.parseInt(params[4]);
                    employee.setAge(age);
                } catch (Exception e) {
                    employee.setEmail(params[4]);
                }
            } else if (params.length > 5) {
                employee.setEmail(params[4]);
                employee.setAge(Integer.parseInt(params[5]));
            }


            if (!departments.containsKey(params[3])) {
                departments.put(params[3], new Department(params[3]));
            }

            departments.get(params[3]).addEmployee(employee);
        }

        List<Department> sortedJobs = departments
                .values()
                .stream()
                .sorted(((o1, o2) -> Double.compare(o2.getAverage(), o1.getAverage())))
                .collect(Collectors.toList());

        Department bestJob = sortedJobs.get(0);
        System.out.printf("Highest Average Salary: %s%n", bestJob.getName());

        List<Employee> sortedEmployees = bestJob
                .getEmployees()
                .stream()
                .sorted(((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary())))
                .collect(Collectors.toList());

        for (Employee employee : sortedEmployees)
            System.out.println(String.format("%s %.2f %s %d",
                            employee.getName(),
                            employee.getSalary(),
                            employee.getEmail(),
                            employee.getAge()));

    }
}