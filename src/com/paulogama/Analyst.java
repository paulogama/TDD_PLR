package com.paulogama;

/**
 * Created by Paulo Gama on 05/07/17.
 *
 */

public class Analyst extends Employee {

    Analyst(int performance) {
        super(performance);
    }

    @Override
    public int multiplier() {
        return 2;
    }

}
