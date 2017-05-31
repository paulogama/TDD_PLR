package com.paulogama;

/**
 * Created by Paulo Gama on 31/05/17.
 *
 */

class Calculator {
    Boolean isEligible(Company company) {
        return company.employeesCount * 10000 < company.profitMargin;
    }

    int multiplier(Employee employee) {
        switch (employee.post) {
            case "Trainee":
                return 1;
            case "Analyst":
                return 2;
            case "Manager":
                return 3;
            default:
                return 0;
        }
    }

    double profit(Company company, Employee employee) {
        return employee.performance * multiplier(employee) * (0.4 * company.profitMargin / company.employeesCount);
    }
}
