// Create a class rectangle with members length and breadth. write methods to calculate and display area and perimeter. create multiple rectangle objects. 

import java.util.Scanner;

class Area {
    float length;
    float breadth;

    public void accept() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the Rectangle length: ");
        length = sc1.nextFloat();
        System.out.print("Enter the Rectangle breadth: ");
        breadth = sc2.nextFloat();
        System.out.println();
    }

    public void display() {
        System.out.println("Area of the Rectangle is  " + (length * breadth));
        System.out.println("Perimeter of the Rectangle is " + (2 * (length + breadth)));
        System.out.println();
    }
}

class Rectangle {
    public static void main(String[] args) {
        Area a1 = new Area();
        Area a2 = new Area();
        a1.accept();
        a2.accept();
        a1.display();
        a2.display();
    }
}