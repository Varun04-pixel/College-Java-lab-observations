// Develop a java program to create a class student with members usn and name. Include methods to accept and display student details. Create multiple student object and display their information.

import java.util.Scanner;

class StudentDtl {
    String USN;
    String name;

    public void accept() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter student USN: ");
        USN = sc1.nextLine();
        System.out.print("Enter student name: ");
        name = sc2.nextLine();
        System.out.println();
    }

    public void display() {
        System.out.println("Student USN: " + USN);
        System.out.println("Student Name: " + name);
        System.out.println();
    }
}

class Student {
    public static void main(String[] args) {
        StudentDtl s1 = new StudentDtl();
        StudentDtl s2 = new StudentDtl();
        StudentDtl s3 = new StudentDtl();
        StudentDtl s4 = new StudentDtl();
        s1.accept();
        s2.accept();
        s3.accept();
        s4.accept();
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}