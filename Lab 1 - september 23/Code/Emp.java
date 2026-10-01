class Employee {
    int id;
    String name;
    public void display(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display(983, "John");
        System.out.println("Employee id: "+e1.id);
        System.out.println("Employee name: "+e1.name);
    }
}