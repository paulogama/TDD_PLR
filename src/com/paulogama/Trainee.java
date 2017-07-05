package com.paulogama;

/**
 * Created by Paulo Gama on 04/07/17.
 *
 */

public class Trainee extends Employee {

    Trainee(String post, int performance) {
        super(post, performance);
    }

    int multiplier() {
        return 1;
    }

}
