import java.util.Scanner;

class Employee {
    int id;
    String name;

    public void display(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp_inp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.print("Enter the Employee id: ");
        int id = sc.nextInt();
        System.out.print("Enter the Employee name: ");
        String name = sc2.nextLine();
        e1.display(id, name);
        System.out.println("Employee id: " + e1.id);
        System.out.println("Employee name: " + e1.name);
    }
}