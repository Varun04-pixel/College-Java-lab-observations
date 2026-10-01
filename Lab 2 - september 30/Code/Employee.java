// Develop a java program to create a class employee with members employee id, name , and salary. include methods to accept and display employee details. create multiple employee objects and display their information. 

import java.util.Scanner;

class EmployeeDtl {
    String emp_id;
    String name;
    int salary;

    public void accept() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = sc1.nextLine();
        System.out.print("Enter Employee name: ");
        name = sc2.nextLine();
        System.out.print("Enter Employee salary: ");
        salary = sc3.nextInt();
        System.out.println();
    }

    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }
}

class Employee {
    public static void main(String[] args) {
        EmployeeDtl e1 = new EmployeeDtl();
        EmployeeDtl e2 = new EmployeeDtl();
        EmployeeDtl e3 = new EmployeeDtl();
        e1.accept();
        e2.accept();
        e3.accept();
        e1.display();
        e2.display();
        e3.display();
    }
}