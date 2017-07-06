package com.paulogama;

/**
 * Created by Paulo Gama on 05/07/17.
 *
 */

public class Manager extends Employee {
    Manager(int performance) {
        super(performance);
    }

    @Override
    public int multiplier() {
        return 3;
    }

}
