import java.util.*;

public class Solution {
    public static void main(String[] args) {

        List<Employee> employee=new ArrayList<>();
        employee.add(new Employee(1,"Paras",450000.0));
        employee.add(new Employee(2,"Harsh",350000.0));
        employee.add(new Employee(3,"Rahul",400000.0));
        employee.add(new Employee(4,"Mohit",450000.0));

        for(Employee val:employee){
            val.displayDetails();
            System.out.println("-------------------");
        }
    }
}

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void displayDetails(){
        System.out.println("Employee ID    : "+id);
        System.out.println("Employee Name  : "+name);
        System.out.println("Employee Salary: "+salary);
    }
}
