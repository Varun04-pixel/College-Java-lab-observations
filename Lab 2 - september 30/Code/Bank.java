// Develop a java program to create a class bankAccount with members account number, accoun holder name, and balance. include methods to accept and display account details. create multiple bank account objects. 

import java.util.Scanner;

class BankAccount {
    int acc_no;
    String name;
    int balance;

    public void accept() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter Account no.: ");
        acc_no = sc1.nextInt();
        System.out.print("Enter Account holder name: ");
        name = sc2.nextLine();
        System.out.print("Enter the amount to deposit: ");
        balance = sc3.nextInt();
        System.out.println();
    }

    public void display() {
        System.out.println("Account no.: " + acc_no);
        System.out.println("Account holder Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

class Bank {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        BankAccount a3 = new BankAccount();
        a1.accept();
        a2.accept();
        a3.accept();
        a1.display();
        a2.display();
        a3.display();
    }
}