package com.paulogama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("**** Enter the number of employers ****");

        Scanner scanner = new Scanner(System.in);
        int employees = scanner.nextInt();

        System.out.println("**** Enter the profit margins this year ***");

        int profitMargin = scanner.nextInt();

        Company company = new Company(employees, profitMargin);

        System.out.println("**** Now you can calculate the profit of an employee! ***");
        System.out.println("**** Please, enter the Post <Trainee, Analyst, Manager> ***");

        String post = scanner.next();

        System.out.println("**** Please, enter the yearly performance <1..5> ***");

        int performance = scanner.nextInt();

        Employee employee = new Employee(post, performance);

        Calculator calculator = new Calculator();

        System.out.println("The value of profit is -> " + calculator.profit(company, employee));
    }
}
