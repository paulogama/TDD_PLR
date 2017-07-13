package com.paulogama;

/**
 * Created by pgama on 04/07/17.
 */
public class Trainee extends Post {

    Trainee(int performance) {
        super(performance);
    }

    @Override
    public int multiplier() {
        return 1;
    }

}
