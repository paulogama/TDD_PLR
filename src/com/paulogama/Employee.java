package com.paulogama;

/**
 * Created by Paulo Gama on 31/05/17.
 *
 */

class Employee {

    IPost post;
    int performance;

    Employee(IPost post, int performance) {
        this.post = post;
        this.performance = performance;
    }

    public double profit(int profitMargin, int employeesCount) {
        return performance * post.multiplier() * (0.4 * profitMargin / employeesCount);
    }
}
