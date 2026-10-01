class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp_cons {
    public static void main(String[] args) {
        Employee e1 = new Employee(784, "john");
        System.out.println("Employee id: " + e1.id);
        System.out.println("Employee name: " + e1.name);
    }
}