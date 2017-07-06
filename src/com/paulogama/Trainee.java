package com.paulogama;

/**
 * Created by Paulo Gama on 04/07/17.
 *
 */

public class Trainee extends Employee {

    Trainee(int performance) {
        super(performance);
    }

    @Override
    public int multiplier() {
        return 1;
    }


}
