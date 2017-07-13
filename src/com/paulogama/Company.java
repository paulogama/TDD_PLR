package com.paulogama;

/**
 * Created by Paulo Gama on 31/05/17.
 *
 */

class Company {

    int employeesCount;
    int profitMargin;

    Company(int employeesCount, int profitMargin) {
        this.employeesCount = employeesCount;
        this.profitMargin = profitMargin;
    }

    Boolean isEligible() {
        return employeesCount * 10000 < profitMargin;
    }

}
