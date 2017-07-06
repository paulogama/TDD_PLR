package com.paulogama;

/**
 * Created by Paulo Gama on 31/05/17.
 *
 */

abstract class Employee implements IEmployee {

    int performance;

    Employee(int performance) {
        this.performance = performance;
    }

    double profit(Company company) {
        return performance * multiplier() * (0.4 * company.profitMargin / company.employeesCount);
    }

    public abstract int multiplier();

}
