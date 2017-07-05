package com.paulogama;

/**
 * Created by Paulo Gama on 31/05/17.
 *
 */

class Employee {

    String post;
    int performance;

    Employee(String post, int performance) {
        this.post = post;
        this.performance = performance;
    }

    int multiplier() {
        switch (post) {
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

    double profit(Company company) {
        return performance * multiplier() * (0.4 * company.profitMargin / company.employeesCount);
    }

}
